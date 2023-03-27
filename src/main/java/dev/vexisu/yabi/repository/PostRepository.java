package dev.vexisu.yabi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.vexisu.yabi.impl.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
