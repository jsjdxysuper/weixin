package top.liyang024.smallprobackinter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import net.sf.json.JSONObject;
import top.liyang024.table.dao.TSysCodeMapper;
import top.liyang024.table.domain.TSysCode;
import top.liyang024.table.domain.TSysCodeKey;

@Controller
public class MultimediaResource {
	@Autowired
	private TSysCodeMapper tSysCodeMapper;
	
	@ResponseBody
	@RequestMapping(value="circlePic",produces={"text/html;charset=UTF-8;","application/json;charset=UTF-8;"})
	public String lightInit() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		TSysCodeKey key = new TSysCodeKey();
		key.setcTypeid("sysset");
		key.setcId("circlePic");
		TSysCode picList = tSysCodeMapper.selectByPrimaryKey(key);
		return JSONObject.fromObject(picList).toString();
	}
}
