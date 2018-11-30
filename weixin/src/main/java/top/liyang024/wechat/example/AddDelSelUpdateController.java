package top.liyang024.wechat.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddDelSelUpdateController {
	@RequestMapping(value="AddDelSelUpdate")
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView("AddDelSelUpdate");

		
		return mv;
	}
}
