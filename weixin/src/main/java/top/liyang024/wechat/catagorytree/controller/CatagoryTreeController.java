package top.liyang024.wechat.catagorytree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import net.sf.json.JSONArray;
import top.liyang024.table.domain.TCatagorytree;
import top.liyang024.table.domain.TUrl;
import top.liyang024.wechat.catagorytree.serv.CatagoryTreeServ;

@Controller
public class CatagoryTreeController {
	
	@Autowired
	private CatagoryTreeServ catagoryTreeServ;
	
	@RequestMapping(value="/catagory/init")
	public ModelAndView home(){
		ModelAndView mv = new ModelAndView("userList");
		return mv;
	}
	
	@ResponseBody
	@RequestMapping(value="/catagory/list",produces={"text/html;charset=UTF-8;","application/json;charset=UTF-8;"})
	public String lightInit() {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("index");

//		List<TUrl> tList = indexServ.searchMenuTree();
		List<TCatagorytree> allCatagoryList = catagoryTreeServ.allCatagory();
		
		return JSONArray.fromObject(allCatagoryList).toString();
	}
}
