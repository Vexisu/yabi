package dev.vexisu.yabi.impl;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class ApplicationProperty {
    @Id
    @EqualsAndHashCode.Include
    private String name;
    private String value;
}
