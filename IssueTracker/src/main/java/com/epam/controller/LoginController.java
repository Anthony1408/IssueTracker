package com.epam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("login")
	public ModelAndView getLoginForm(
			@RequestParam(required = false) String authfailed, String logout) {
		String message = "";
//		User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//		System.out.println("user ===== " + user);
		return new ModelAndView("login", "message", message);
	}
	
	@RequestMapping(value = "/loginfailed", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {
		String message = "Error";
		model.addAttribute("error", message);
		return "login";
	}

	@RequestMapping("profile")
	public String geProfilePage() {
		return "profile";
	}
}
