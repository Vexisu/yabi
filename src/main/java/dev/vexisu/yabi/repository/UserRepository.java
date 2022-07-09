package dev.vexisu.yabi.repository;

import dev.vexisu.yabi.impl.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
