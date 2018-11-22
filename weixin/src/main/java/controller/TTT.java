package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import top.liyang024.sys.dao.TUrlMapper;
import top.liyang024.sys.domain.TUrl;
import top.liyang024.sys.domain.TUrlExample;

@Controller
public class TTT {
	@Autowired
	private TUrlMapper tUrlMapper;
	@RequestMapping(value="/oka")
	public ModelAndView lightInit() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("pages/Light");
		TUrl tUrl = tUrlMapper.selectByPrimaryKey("advertising.html");
		TUrlExample example = new TUrlExample();
		example.createCriteria();
		List<TUrl> tList = tUrlMapper.selectByExample(example);
		return mv;
	}
}
