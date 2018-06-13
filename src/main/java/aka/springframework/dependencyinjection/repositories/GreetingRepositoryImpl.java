package aka.springframework.dependencyinjection.repositories;

import org.springframework.stereotype.Repository;

/**
 * Created by AP
 */
@Repository
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello World!!!";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hola Mundo!!!";
    }

    @Override
    public String getGermanGreeting() {
        return "Hallo Welt!!!";
    }
}
