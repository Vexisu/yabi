package dev.vexisu.yabi.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties("yabi.personalization")
public class PersonalizationProperties {
	private String title;
	private String description;
}
