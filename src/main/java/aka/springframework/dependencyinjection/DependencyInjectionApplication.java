package aka.springframework.dependencyinjection;

import aka.springframework.dependencyinjection.controllers.ConstructorInjectedController;
import aka.springframework.dependencyinjection.controllers.MyController;
import aka.springframework.dependencyinjection.controllers.PropertyInjectedController;
import aka.springframework.dependencyinjection.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//use @ComponentScan if bean are defined package(s) other than current package/child packages or you can also use basePackageClasses to scan classes
//@ComponentScan(basePackages = {"aka.springframework.dependencyinjection", "aka.springframework.demoComponentScan"})
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

        //gets an instance of MyController using application context
        MyController controller = (MyController) ctx.getBean("myController");

        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }
}
