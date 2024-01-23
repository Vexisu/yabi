package dev.vexisu.yabi.impl;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "blog_user")
@Entity
public class User {
	@Id
	@NotNull
	@EqualsAndHashCode.Include
	private String username;
	@NotNull
	private String hashedPassword;
}
