package org.sovliv.beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author Vladimir Solovyov
 * @project BeanLifeCycle
 * @date on 27/06/2025
 */

@Component
public class LifeCycleBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof LifeCycleBean) {
            System.out.println("5. call BPP BEFORE initialization");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof LifeCycleBean) {
            System.out.println("8. call BPP AFTER initialization");
        }
        return bean;
    }
}
