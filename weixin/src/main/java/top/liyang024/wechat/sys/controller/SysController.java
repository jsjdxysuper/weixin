package top.liyang024.wechat.sys.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import net.sf.json.JSONArray;
import top.liyang024.table.domain.TCatagorytree;
import top.liyang024.table.domain.TSysCode;
import top.liyang024.wechat.sys.serv.SysServ;

@Controller
public class SysController {
	@Autowired
	SysServ sysServ;
	
	@ResponseBody
	@RequestMapping(value="sysCode",produces={"text/html;charset=UTF-8;","application/json;charset=UTF-8;"})
	public String lightInit(@RequestParam("typeid") String typeid,@RequestParam("id") String id) {

		List<TSysCode> retrieveSysCodeList = sysServ.retrieveSysCodeList(typeid, id);
		JSONArray ja = JSONArray.fromObject(retrieveSysCodeList);
		return ja.toString();
	}
	
	@ResponseBody
	@RequestMapping(value="sysCodeVideoList",produces={"text/html;charset=UTF-8;","application/json;charset=UTF-8;"})
	public String getSysCodeVideoList(@RequestParam("typeid") String typeid,@RequestParam("id") String id) {

		List<TCatagorytree> retrieveSysCodeVideoList = sysServ.retrieveSysCodeVideoList(typeid, id);

		JSONArray ja = JSONArray.fromObject(retrieveSysCodeVideoList);
		return ja.toString();
	}
}
