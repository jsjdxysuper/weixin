package top.liyang024.wechat.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UploadFileController {
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
				
				return "Upload";
	}
	
	
	@PostMapping(value="/uploadFile/multiFile")
	public String multiFile(@RequestParam("file") MultipartFile[] uploadFiles,String name,HttpSession session) {
		String ret = "Upload";
		try {
			for(int i=0;i<uploadFiles.length;i++) {
				MultipartFile item = uploadFiles[i];
				
				if(item.getSize()>0) {
					String fileName = item.getOriginalFilename();
					
					String leftPath = session.getServletContext().getRealPath("/resources");
					File file = new File(leftPath,fileName);
					
					item.transferTo(file);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ret;
	}
	
	
	@RequestMapping(value="uploadFile/init")
	public ModelAndView init(){
		ModelAndView mv = new ModelAndView("Upload");

		
		return mv;
	}
}
