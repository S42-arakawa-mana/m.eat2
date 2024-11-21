package com.example.m.eat2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {

	@GetMapping("/")
	public String index() {
		return "pages/index";
	}
}