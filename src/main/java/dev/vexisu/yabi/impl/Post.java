package dev.vexisu.yabi.impl;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "blog_post")
@Entity
public class Post {
	@Id
	@GeneratedValue
	@EqualsAndHashCode.Include
	private Integer id;
	@NotNull
	private String title;
	private String content;
	private Date creationDate;
	@ManyToOne
	private User author;
}
