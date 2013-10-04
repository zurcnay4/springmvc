package springapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class appController {
	@RequestMapping("/view")
	public ModelAndView view() {
		String message = "Spring MVC";
		return new ModelAndView("view", "fromAppController", message);
	}
}
