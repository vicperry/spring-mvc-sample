package com.vicperry.regescweb.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class HelloController {
	
	@GetMapping("/hello-modelview")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView("hello"); //nome do arquivo a ser renderizado
		mv.addObject("name", "Wendy");
		return mv;
	};
	
	@GetMapping("/hello-model")
	public String hello(Model model) {
		model.addAttribute("name", "Max");
		return "hello";
	};
	
	@GetMapping("/hello-servlet")
	public String helloServlet(HttpServletRequest request) {
		request.setAttribute("name", "Piotr");
		return "hello"; //templates/hello.html
	};
}
