package dev.vexisu.yabi.post;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import dev.vexisu.yabi.post.exception.PostNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {
	private final PostRepository postRepository;

	public Post getPost(Long id) {
		return postRepository.findById(id).orElseThrow(() -> new PostNotFoundException(id));
	}

	public Page<Post> getPostsPage(int page, int itemsAmount){
		return postRepository.findAll(PageRequest.of(page, itemsAmount, Sort.by("creationDate").descending()));
	}
}
