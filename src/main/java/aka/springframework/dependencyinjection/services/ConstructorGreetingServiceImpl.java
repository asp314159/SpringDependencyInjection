package aka.springframework.dependencyinjection.services;

import org.springframework.stereotype.Service;

/**
 * Created by AP
 */
@Service
public class ConstructorGreetingServiceImpl implements GreetingService {

    public static final String hello = "Hello DI works with Qualifier(\"constructorGreetingServiceImpl\")!!!";

    @Override
    public String sayGreeting() {
        return hello;
    }
}
