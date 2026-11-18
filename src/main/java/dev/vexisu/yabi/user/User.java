package dev.vexisu.yabi.user;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Table(name = "yabi_user")
@Entity
public class User {
    @Id
    @NotNull
    private String username;

    @NotNull
    private String hashedPassword;

    private Instant creationDate;
}
