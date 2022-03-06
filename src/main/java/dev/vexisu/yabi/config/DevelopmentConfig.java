package dev.vexisu.yabi.config;

import dev.vexisu.yabi.impl.Post;
import dev.vexisu.yabi.impl.User;
import dev.vexisu.yabi.repository.PostRepository;
import dev.vexisu.yabi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile ("development")
@Configuration
public class DevelopmentConfig
{
	private final PostRepository postRepository;
	private final UserRepository userRepository;

	@Autowired
	public DevelopmentConfig(PostRepository postRepository, UserRepository userRepository)
	{
		this.postRepository = postRepository;
		this.userRepository = userRepository;
	}

	@Bean
	public void addTestData()
	{
		var user = new User();
		user.setUsername("user");
		user.setHashedPassword("qwertyuiop");
		userRepository.save(user);
		var post = new Post();
		post.setId(1);
		post.setTitle("Test post");
		post.setContent("This is a test post.");
		post.setAuthor(user);
		postRepository.save(post);
	}
}
