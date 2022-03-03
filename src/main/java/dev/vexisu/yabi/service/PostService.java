package dev.vexisu.yabi.service;

import java.util.Optional;
import dev.vexisu.yabi.impl.Post;
import dev.vexisu.yabi.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService
{
	private final PostRepository postRepository;

	@Autowired
	public PostService(PostRepository postRepository)
	{
		this.postRepository = postRepository;
	}

	public Optional<Post> getPost(Integer id)
	{
		return Optional.of(postRepository.getById(id));
	}
}
