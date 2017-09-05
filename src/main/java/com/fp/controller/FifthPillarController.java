package com.fp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fp.GlobalProperties;

@Controller
public class FifthPillarController {

	@Autowired
	private GlobalProperties globalProperties;

	@RequestMapping("/home")
	public String homePage(Map<String, Object> model) {
		System.out.println(globalProperties.getMessage() + " on Fifth Pillar.");
		return "fifth_pillar_home";
	}
	
	@RequestMapping("/mentor")
	public String mentor(Map<String, Object> model) {
		return "pages/mentor";
	}
	
	@RequestMapping("/team")
	public String team(Map<String, Object> model) {
		return "pages/team";
	}
	
	@RequestMapping("/contact")
	public String contact(Map<String, Object> model) {
		return "Contact";
	}
	
	@RequestMapping("/service")
	public String service(Map<String, Object> model) {
		return "pages/services";
	}

}