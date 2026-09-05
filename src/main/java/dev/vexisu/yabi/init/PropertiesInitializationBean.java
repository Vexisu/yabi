package dev.vexisu.yabi.init;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import dev.vexisu.yabi.service.ApplicationPropertyService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PropertiesInitializationBean {
    private static final String[][] PROPERTIES = {
            { "yabi.personalization.title", "My fresh blog" },
            { "yabi.personalization.motd", "Powered by Yabi." }
    };
    private final ApplicationPropertyService applicationPropertyService;

    @PostConstruct
    @Transactional
    public void initializeProperties(){
        for (String[] property : PROPERTIES) {
            this.applicationPropertyService.saveIfNotExists(property[0], property[1]);
        }
    }
}
