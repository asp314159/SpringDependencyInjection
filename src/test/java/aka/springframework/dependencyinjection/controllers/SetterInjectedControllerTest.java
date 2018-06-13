package aka.springframework.dependencyinjection.controllers;

import aka.springframework.dependencyinjection.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AP
 */
public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void test() throws Exception {
        assertEquals(GreetingServiceImpl.hello, setterInjectedController.sayHello());
    }
}
