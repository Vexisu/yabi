package dev.vexisu.yabi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController
{
	@GetMapping ("/")
	public String view()
	{
		return "index";
	}
}
