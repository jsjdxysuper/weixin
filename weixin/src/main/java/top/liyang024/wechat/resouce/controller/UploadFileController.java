package top.liyang024.wechat.resouce.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

import com.kedong.tool.Utilities;

import top.liyang024.base.RetJsonMsg;
import top.liyang024.table.dao.TSysCodeValMapper;
import top.liyang024.table.domain.TSysCode;
import top.liyang024.table.domain.TSysCodeVal;
import top.liyang024.table.domain.TSysCodeValKey;
import top.liyang024.table.domain.TUploadres;
import top.liyang024.wechat.resouce.service.UploadFileService;

@Controller
public class UploadFileController {
	Logger log = LoggerFactory.getLogger(UploadFileController.class);
	@Autowired
	private UploadFileService uploadFileService;
	@Autowired
	private TSysCodeValMapper sysCodeValMapper;
	
	@RequestMapping(value="/uploadFile/upload")
	public String upload(HttpServletRequest request){
		try {
			long  startTime=System.currentTimeMillis();
			//将当前上下文初始化给  CommonsMutipartResolver （多部分解析器）
			CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver(
					request.getSession().getServletContext());
			//检查form中是否有enctype="multipart/form-data"
			if(multipartResolver.isMultipart(request))
			{
				//将request变成多部分request
				MultipartHttpServletRequest multiRequest=(MultipartHttpServletRequest)request;
				//获取multiRequest 中所有的文件名
				Iterator iter=multiRequest.getFileNames();

				while(iter.hasNext())
				{
					//一次遍历所有文件
					MultipartFile file=multiRequest.getFile(iter.next().toString());
					if(file!=null)
					{
						String path="E:/springUpload"+file.getOriginalFilename();
						//上传
						file.transferTo(new File(path));
					}

				}

			}
			long  endTime=System.currentTimeMillis();
			System.out.println("方法三的运行时间："+String.valueOf(endTime-startTime)+"ms");
		}catch(IllegalStateException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return "success"; 
	}
	
	@PostMapping(value="/uploadFile/oneFile")
	public String oneUpload(@RequestParam("file") MultipartFile file,String name,HttpSession session) {
		String basePath = session.getServletContext().getRealPath("/");
		//获取文件名
				String fileName = file.getOriginalFilename();
				System.out.println(fileName);
				
				//目标文件
				File targetFile = new File(basePath,fileName);
				
				//转存文件
				try {
					file.transferTo(targetFile);
				} catch (IllegalStateException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				System.out.println(targetFile.getAbsolutePath());
				
				return "success";
	}
	
	
	@PostMapping(value="/uploadFile/multiFile")
	public ModelAndView multiFile(@RequestParam("file") MultipartFile[] uploadFiles,
			@RequestParam("mark") String[] markList,
			@RequestParam("fileType") String[] fileTypeList,
			HttpSession session) {

		String time = Utilities.getToday()+"-"+Utilities.getSysTime().replaceAll(":", "-");
		String leftPath = session.getServletContext().getRealPath("/")+"../resources";
		File pathFile = new File(leftPath);
		if(pathFile.exists()) {
			if(pathFile.isDirectory())
				log.info("目录已经存在");
			else {
				log.info("存在文件与文件夹重名");
			}
		}else {
			log.info("目录不存在，创建目录...");
			pathFile.mkdir();
		}
		List<File>fileList = new ArrayList();
		try {
			for(int i=0;i<uploadFiles.length;i++) {
				MultipartFile item = uploadFiles[i];
				
				if(item.getSize()>0) {
					String fileName = item.getOriginalFilename();
					fileName = time+(i+1)+"_"+fileName;
					
					File file = new File(leftPath,fileName);
					fileList.add(file);
					item.transferTo(file);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		String cTime = Utilities.getSysTime();
		String cDate = Utilities.getToday();
		List<TUploadres> fileProList = new ArrayList<TUploadres>();
		for(int i=0;i<uploadFiles.length;i++) {
			TUploadres oneFilePro = new TUploadres();
			oneFilePro.setcFilename(fileList.get(i).getName());
			oneFilePro.setcFilepath(fileList.get(i).getPath());
			if(markList.length>i)
				oneFilePro.setcMark(markList[i]);
			String suffix = oneFilePro.getcFilename().
					substring(oneFilePro.getcFilename().lastIndexOf("."), oneFilePro.getcFilename().length());
			oneFilePro.setcSufix(suffix);
			oneFilePro.setcTime(cTime);
			oneFilePro.setcDate(cDate);
			oneFilePro.setcFilesize((int)(fileList.get(i).length()/1000));
			oneFilePro.setcType(fileTypeList[i]);

			String fileTypeName = "";
			if(fileTypeList[i].compareToIgnoreCase("img")==0)
				fileTypeName = "图片";
			else if(fileTypeList[i].compareToIgnoreCase("video")==0)
				fileTypeName = "视频";
			oneFilePro.setcTypename(fileTypeName);
			fileProList.add(oneFilePro);
		}
		int count = uploadFileService.storeFileList(fileProList);
		RetJsonMsg retMsg = new RetJsonMsg();
		retMsg.setCode(1);
		retMsg.setMsg("成功上传"+count+"份文件");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("common/success");
		mv.addObject("retMsg", retMsg);
		return mv;
	}
	
	
	@RequestMapping(value="uploadFile/init")
	public ModelAndView init(){
		
		ModelAndView mv = new ModelAndView("Upload");
//		List<TSysCodeVal> fileTypeList = uploadFileService.getFileTypeList();
//		mv.addObject("fileTypeList", fileTypeList);
		
		
		return mv;
	}
	
	@Test
	public void test1() {
		String time = Utilities.getToday()+"-"+Utilities.getSysTime().replaceAll(":", "-");
		System.out.println(time);
	}
}
