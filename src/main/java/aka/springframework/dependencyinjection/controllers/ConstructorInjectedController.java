package aka.springframework.dependencyinjection.controllers;

import aka.springframework.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by AP
 */
@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    //@Autowired //not needed by spring takes care of it internally for constructor DI
    public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
