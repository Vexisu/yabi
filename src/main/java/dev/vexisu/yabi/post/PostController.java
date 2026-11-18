package dev.vexisu.yabi.post;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping("/post/view/{id}")
    public String view(Model model, @PathVariable Long id) {
        model.addAttribute("post", postService.getPost(id));
        return "post/view";
    }
}
