package dev.vexisu.yabi.repository;

import dev.vexisu.yabi.impl.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Integer>
{
	Post getById(Integer id);
}