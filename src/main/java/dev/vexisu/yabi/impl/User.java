package dev.vexisu.yabi.impl;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;
@Data
@Entity
public class User
{
	@Id
	private String username;
}