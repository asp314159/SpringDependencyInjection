package aka.springframework.dependencyinjection.controllers;

import aka.springframework.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by AP
 */
@Controller
public class MyController {

    @Autowired
    private GreetingService greetingService;

    public String hello() {
        System.out.println("Hello World - Application Context Example");
        return greetingService.sayGreeting();
    }
}
