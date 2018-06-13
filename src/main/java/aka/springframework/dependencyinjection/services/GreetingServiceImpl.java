package aka.springframework.dependencyinjection.services;

import org.springframework.stereotype.Service;

/**
 * Created by AP
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String hello = "Hello DI works!!!";

    @Override
    public String sayGreeting() {
        return hello;
    }
}
