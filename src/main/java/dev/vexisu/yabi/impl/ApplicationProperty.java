package dev.vexisu.yabi.impl;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "blog_property")
@Entity
public class ApplicationProperty {
    @Id
    @EqualsAndHashCode.Include
    private String name;
    private String property;
}
