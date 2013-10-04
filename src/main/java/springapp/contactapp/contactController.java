package springapp.contactapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes
public class contactController {
	@RequestMapping(value = "/addContact", method = RequestMethod.POST)
	public String view(@ModelAttribute Contact contact, Model model) {
		model.addAttribute("firstFromController", contact.getFirstname());
     
    return "index";
	}
	
	@RequestMapping("/contact")
	public ModelAndView viewContact() {
		return new ModelAndView("contact", "command", new Contact());
	}

}
