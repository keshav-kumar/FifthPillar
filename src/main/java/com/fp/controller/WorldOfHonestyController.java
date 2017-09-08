package com.fp.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/worldofhonesty/*")
public class WorldOfHonestyController {

	@RequestMapping("/home")
	public String homePage(Map<String, Object> model) {
		model.put("message", "Welcome On World Of Honesty");
		return "who/world_of_honesty_home";
	}
	
}
