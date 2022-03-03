package dev.vexisu.yabi.impl;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class User
{
	@Id
	@NotNull
	private String username;
	@NotNull
	private String hashedPassword;

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o))
		{
			return false;
		}
		User user = (User) o;
		return username != null && Objects.equals(username, user.username);
	}

	@Override
	public int hashCode()
	{
		return getClass().hashCode();
	}
}
