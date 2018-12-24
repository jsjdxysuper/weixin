package top.liyang024.wechat.videotree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import net.sf.json.JSONArray;
import top.liyang024.table.domain.TCatagorytree;
import top.liyang024.wechat.videotree.serv.VideoTreeServ;

@Controller
public class VideoTreeController {
	@Autowired
	private VideoTreeServ  videoTreeServ;
	
	@ResponseBody
	@RequestMapping(value="/catagoryTree/catagoryList",produces={"text/html;charset=UTF-8;","application/json;charset=UTF-8;"})
	public String catagoryList() {
		List<TCatagorytree> catagoryList = videoTreeServ.catagoryList();
		return JSONArray.fromObject(catagoryList).toString();
	}
}
