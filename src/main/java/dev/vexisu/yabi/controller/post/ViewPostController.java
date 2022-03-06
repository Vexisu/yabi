package dev.vexisu.yabi.controller.post;

import java.util.Optional;
import dev.vexisu.yabi.impl.Post;
import dev.vexisu.yabi.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

	@GetMapping ("/post/view/{id}")
	public String view(Model model, @PathVariable Integer id)
	{
		Optional<Post> postOptional = postService.getPost(id);
		postOptional.ifPresent(post -> model.addAttribute("post", post));
		return "post/view";
	}
}
