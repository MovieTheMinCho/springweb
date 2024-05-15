package org.student.simpleproject.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	@GetMapping("/")
	public String hello(Model model, @RequestParam Map<String, String> map) {
		String name;
		name = map.getOrDefault("name", "My Friend");
		model.addAttribute("name", name);
		return "hello";
	}
}
