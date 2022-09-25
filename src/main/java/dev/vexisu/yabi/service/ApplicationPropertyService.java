package dev.vexisu.yabi.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.vexisu.yabi.impl.ApplicationProperty;
import dev.vexisu.yabi.repository.ApplicationPropertyRepository;

@Service
public class ApplicationPropertyService {
    private ApplicationPropertyRepository applicationPropertyRepository;

    public ApplicationPropertyService(ApplicationPropertyRepository applicationPropertyRepository) {
        this.applicationPropertyRepository = applicationPropertyRepository;
    }

    public void saveIfNotExists(String name, String property)
    {
        if (!this.applicationPropertyRepository.existsById(name)){
            var applicationProperty = new ApplicationProperty();
            applicationProperty.setName(name);
            applicationProperty.setProperty(property);
            applicationPropertyRepository.save(applicationProperty);
        }
    }

    public String getProperty(String name){
        Optional<ApplicationProperty> propertyOptional = this.applicationPropertyRepository.findById(name);
        return propertyOptional.isPresent() ? propertyOptional.get().getProperty() : "null";
    }
}
