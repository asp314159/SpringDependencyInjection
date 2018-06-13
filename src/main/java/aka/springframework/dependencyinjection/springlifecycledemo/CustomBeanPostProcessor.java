package aka.springframework.dependencyinjection.springlifecycledemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by AP
 */
@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if(bean instanceof SpringLifeCycleDemo){
            ((SpringLifeCycleDemo) bean).beforeInit();
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof SpringLifeCycleDemo){
            ((SpringLifeCycleDemo) bean).afterInit();
        }

        return bean;
    }
}
