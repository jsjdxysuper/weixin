package top.liyang024.wechat.index.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import top.liyang024.table.dao.TUrlMapper;
import top.liyang024.table.domain.TUrl;
import top.liyang024.table.domain.TUrlExample;
import top.liyang024.wechat.index.serv.IndexServ;

@Controller
public class IndexController {

	@Autowired
	private IndexServ indexServ;
	
	@RequestMapping(value="index")
	public ModelAndView index(){
		List<TUrl> tList = indexServ.searchMenuTree();
		ModelMap map = new ModelMap();
		map.put("treeList", tList);
		ModelAndView mv = new ModelAndView("index",map);

		
		return mv;
	}
	@RequestMapping(value="home")
	public ModelAndView home(){
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}
	@ResponseBody
	@RequestMapping(value="pageMenuTree",produces={"text/html;charset=UTF-8;","application/json;charset=UTF-8;"})
	public String lightInit() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");

		List<TUrl> tList = indexServ.searchMenuTree();
		return JSONArray.fromObject(tList).toString();
	}
}
