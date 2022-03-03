package dev.vexisu.yabi.impl;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
public class Post
{
	@Id
	@GeneratedValue
	private Integer id;
	@NotNull
	private String title;
	private String content;
	private Date creationDate;
	@ManyToOne
	private User author;

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
		Post post = (Post) o;
		return id != null && Objects.equals(id, post.id);
	}

	@Override
	public int hashCode()
	{
		return getClass().hashCode();
	}
}
