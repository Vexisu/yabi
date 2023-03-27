package dev.vexisu.yabi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import dev.vexisu.yabi.service.PostService;

@Controller
public class IndexController {
	private final PostService postService;

	public IndexController(PostService postService) {
		this.postService = postService;
	}

	@GetMapping("/")
	public String view(Model model) {
		model.addAttribute("posts", postService.getPostsPage(0, 10));
		return "index";
	}
}
