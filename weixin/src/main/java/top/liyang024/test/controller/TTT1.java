package top.liyang024.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import top.liyang024.table.dao.TUrlMapper;
import top.liyang024.table.domain.TUrl;
import top.liyang024.table.domain.TUrlExample;


@Controller
public class TTT1 {
	@Autowired
	private TUrlMapper tUrlMapper;
	@RequestMapping(value="/oka")
	public ModelAndView lightInit() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		TUrl tUrl = tUrlMapper.selectByPrimaryKey("advertising.html");
		TUrlExample example = new TUrlExample();
		example.createCriteria();
		List<TUrl> tList = tUrlMapper.selectByExample(example);
		return mv;
	}
	
	@RequestMapping(value="/home1")
	public ModelAndView homeInit() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");

		return mv;
	}
}
