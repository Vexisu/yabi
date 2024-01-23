package dev.vexisu.yabi.init;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import dev.vexisu.yabi.service.ApplicationPropertyService;
import jakarta.annotation.PostConstruct;

@Component
public class PropertiesInitializationBean {
    private static final String[][] PROPERTIES = {
            { "yabi.personalization.title", "My fresh blog" },
            { "yabi.personalization.motd", "Powered by Yabi." }
    };
    private ApplicationPropertyService applicationPropertyService;

    public PropertiesInitializationBean(ApplicationPropertyService applicationPropertyService) {
        this.applicationPropertyService = applicationPropertyService;
    }

    @PostConstruct
    @Transactional
    public void initializeProperties(){
        for (String[] property : PROPERTIES) {
            this.applicationPropertyService.saveIfNotExists(property[0], property[1]);
        }
    }
}
