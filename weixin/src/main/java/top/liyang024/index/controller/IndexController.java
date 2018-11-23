package top.liyang024.index.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import top.liyang024.index.serv.IndexServ;
import top.liyang024.table.dao.TUrlMapper;
import top.liyang024.table.domain.TUrl;
import top.liyang024.table.domain.TUrlExample;

@Controller
public class IndexController {

	@Autowired
	private IndexServ indexServ;
	
	@ResponseBody
	@RequestMapping(value="pageMenuTree",produces={"text/html;charset=UTF-8;","application/json;charset=UTF-8;"})
	public ModelAndView lightInit() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");

		List<TUrl> tList = indexServ.searchMenuList();
		return mv;
	}
}
