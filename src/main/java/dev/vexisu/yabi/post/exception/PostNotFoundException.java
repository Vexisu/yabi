package dev.vexisu.yabi.post.exception;

public class PostNotFoundException extends RuntimeException {
    public PostNotFoundException(Long id) {
        super("Post with id %d not found.".formatted(id));
    }
}
