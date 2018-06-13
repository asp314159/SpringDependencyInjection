package aka.springframework.dependencyinjection.controllers;

import aka.springframework.dependencyinjection.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AP
 */
public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void test() throws Exception {
        assertEquals(GreetingServiceImpl.hello, constructorInjectedController.sayHello());
    }

}
