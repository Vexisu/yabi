package dev.vexisu.yabi.impl;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

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
