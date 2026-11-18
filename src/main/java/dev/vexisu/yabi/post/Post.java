package dev.vexisu.yabi.post;

import java.util.Date;

import dev.vexisu.yabi.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Table(name = "yabi_post")
@Entity
public class Post {
    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private String title;

    private String content;

    private Date creationDate;

    @ManyToOne
    private User author;
}
