package top.liyang024.wechat.resouce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
