package aka.springframework.dependencyinjection.services;

import aka.springframework.dependencyinjection.repositories.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by AP
 */
@Service
@Primary
@Profile("Spanish")
public class PrimarySpanishGreetingServiceImpl implements GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
