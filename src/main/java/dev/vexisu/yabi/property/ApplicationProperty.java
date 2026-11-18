package dev.vexisu.yabi.property;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "yabi_property")
@Entity
public class ApplicationProperty {
    @Id
    private String name;

    private String property;
}
