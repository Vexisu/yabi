package dev.vexisu.yabi.controller.post;

import dev.vexisu.yabi.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ViewPostController
{
	private final PostService postService;

	@Autowired
	public ViewPostController(PostService postService)
	{
		this.postService = postService;
	}

	@GetMapping("/post/view/{id}")
	public String view(@PathVariable Integer id){
		return "post/view";
	}
}
