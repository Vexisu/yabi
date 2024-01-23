package dev.vexisu.yabi.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import dev.vexisu.yabi.impl.Post;
import dev.vexisu.yabi.repository.PostRepository;

@Service
public class PostService {
	private final PostRepository postRepository;

	public PostService(PostRepository postRepository) {
		this.postRepository = postRepository;
	}

	public Optional<Post> getPost(Integer id) {
		return postRepository.findById(id);
	}

	public Page<Post> getPostsPage(int page, int itemsAmount){
		return postRepository.findAll(PageRequest.of(page, itemsAmount, Sort.by("creationDate").descending()));
	}
}
