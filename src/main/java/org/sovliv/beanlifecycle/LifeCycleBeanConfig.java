package org.sovliv.beanlifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Vladimir Solovyov
 * @project BeanLifeCycle
 * @date on 05/07/2025
 */

@Configuration
public class LifeCycleBeanConfig {

    @Bean(initMethod = "customInitMethod", destroyMethod = "customPreDestroyMethod")
    public LifeCycleBean lifeCycleBean() {
        return new LifeCycleBean();
    }
}
