package dev.vexisu.yabi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dev.vexisu.yabi.service.PostService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class IndexController {
	private final PostService postService;

	@GetMapping("/")
	public String view(Model model, @RequestParam(name = "page", defaultValue = "0") Integer page) {
		model.addAttribute("posts", postService.getPostsPage(page, 10));
		return "index";
	}
}
