package dev.vexisu.yabi.controller;

import dev.vexisu.yabi.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ViewController
{
	private PostService postService;

	@Autowired
	public ViewController(PostService postService)
	{
		this.postService = postService;
	}

	@GetMapping("/view/{id}")
	public void view(@PathVariable Integer id){

	}
}
