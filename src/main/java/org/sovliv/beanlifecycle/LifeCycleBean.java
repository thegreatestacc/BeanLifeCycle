package org.sovliv.beanlifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author Vladimir Solovyov
 * @project BeanLifeCycle
 * @date on 27/06/2025
 */

public class LifeCycleBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public LifeCycleBean() {
        System.out.println("1. call constructor. instance created");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("2. call setting bean name. aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("3. setting bean factory. aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("4. setting application context. aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("7. call after properties set at the init stage");
    }

    public void customInitMethod() {
        System.out.println("8. call custom init method");
    }

    @PreDestroy
    public void customPreDestroyMethod() {
        System.out.println("10. call custom predestroy method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("11. call DisposableBean.destroy() method.");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("6. call post construct method");
    }
}
