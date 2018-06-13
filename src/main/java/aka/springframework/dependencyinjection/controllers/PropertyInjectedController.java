package aka.springframework.dependencyinjection.controllers;

import aka.springframework.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by AP
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
