package dev.vexisu.yabi.controller.post;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import dev.vexisu.yabi.impl.Post;
import dev.vexisu.yabi.service.PostService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ViewPostController {
	private final PostService postService;

	@GetMapping("/post/view/{id}")
	public String view(Model model, @PathVariable(name = "id") Integer id) {
		Optional<Post> postOptional = postService.getPost(id);
		postOptional.ifPresent(post -> model.addAttribute("post", post));
		return "post/view";
	}
}
