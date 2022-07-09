package dev.vexisu.yabi.service;

import java.util.Optional;

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
		return Optional.of(postRepository.getById(id));
	}
}
