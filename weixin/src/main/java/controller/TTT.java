package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TTT {
	@RequestMapping(value="/oka")
	public ModelAndView lightInit() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("pages/Light");
		return mv;
	}
}
