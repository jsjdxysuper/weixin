package top.liyang024.wechat.resouce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import top.liyang024.base.RetJsonMsg;
import top.liyang024.table.domain.TUploadres;
import top.liyang024.wechat.resouce.service.UploadFileService;

@Controller
public class UploadFileListController {
	
	@Autowired
	private UploadFileService uploadFileService;
	
	
	@RequestMapping(value="/uploadFile/list/init")
	public ModelAndView fileListInit() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("uploadFile/FileList");
		return mv;
	}
	
	@ResponseBody
	@RequestMapping(value="/uploadFile/list/info",produces={"text/html;charset=UTF-8;","application/json;charset=UTF-8;"})
	public String fileListInfo() {
		List<TUploadres> uploadresList = uploadFileService.getUploadresList();
		JSONArray ja = JSONArray.fromObject(uploadresList);
		RetJsonMsg ret = new RetJsonMsg();
		ret.setCode(1);
		ret.setMsg("");
		ret.setContent(ja.toString());
		
		return JSONObject.fromObject(ret).toString();
	}
	
	@ResponseBody
	@RequestMapping(value="/uploadFile/list/del",produces={"text/html;charset=UTF-8;","application/json;charset=UTF-8;"})
	public String fileDel(String fileName) {
		int count = uploadFileService.deleteFile(fileName);
		RetJsonMsg ret = new RetJsonMsg();
		if(count==1) {
			ret.setCode(1);
			ret.setMsg("删除文件"+fileName+"成功");
			ret.setContent("");
		}else {
			ret.setCode(2);
			ret.setMsg("删除文件"+fileName+"失败");
			ret.setContent("");
		}
		
		return JSONObject.fromObject(ret).toString();
	}
	
	@ResponseBody
	@RequestMapping(value="/uploadFile/list/batchDel",produces={"text/html;charset=UTF-8;","application/json;charset=UTF-8;"})
	public String fileBatchDel(@RequestParam(value = "fileNameArr[]")String []fileNameArr) {
		int count = uploadFileService.batchDeleteFile(fileNameArr);
		RetJsonMsg ret = new RetJsonMsg();
		if(count>=0) {
			ret.setCode(1);
			ret.setMsg("成功删除"+count+"份文件");
			ret.setContent("");
		}else {
			ret.setCode(2);
			ret.setMsg("删除文件失败");
			ret.setContent("");
		}
		return JSONObject.fromObject(ret).toString();
	}
}
