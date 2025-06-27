package org.sovliv.beanlifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BeanLifeCycleApplication {

	public static void main(String[] args) {
		final ConfigurableApplicationContext context = SpringApplication.run(BeanLifeCycleApplication.class, args);
		final Object lifeCycleBean = context.getBean(LifeCycleBean.class);
		System.out.println(lifeCycleBean);
		context.close();
	}

	@Bean(initMethod = "customInitMethod", destroyMethod = "customPreDestroyMethod")
	public LifeCycleBean lifeCycleBean() {
		return new LifeCycleBean();
	}

}

