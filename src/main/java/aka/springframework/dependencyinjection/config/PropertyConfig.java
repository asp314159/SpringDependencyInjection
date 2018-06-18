package aka.springframework.dependencyinjection.config;

import aka.springframework.dependencyinjection.propertysource.FakeDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by AP
 */
@Configuration
//External property source other than application.properties
//@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    //Not needed if using springboot and application.properties
    /*@Bean
    public PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }*/
}
