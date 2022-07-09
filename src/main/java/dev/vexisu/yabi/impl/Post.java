package dev.vexisu.yabi.impl;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
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
