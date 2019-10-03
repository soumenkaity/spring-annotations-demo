package com.stackroute.config;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemoBean;
import com.stackroute.domain.Actor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.stackroute.demo com.stackroute.domain")
public class Config {
    @Bean
    public Actor actor() {
        Actor actor = new Actor();
        actor.setAge(22);
        actor.setGender("Male");
        actor.setName("Soumen Kaity");
        return actor;
    }

    @Bean
    public Actor actorSourodeep() {
        Actor actor = new Actor("Sourodeep Kaity","Male",15);
        return actor;
    }

    @Bean
    public Actor actorSambit() {
        Actor actor = new Actor("Sambit Sharma","Male",30);
        return actor;
    }

    @Bean(initMethod = "customInit",destroyMethod = "customDestroy")
    public BeanLifecycleDemoBean beanLifecycleDemoBean()
    {
        BeanLifecycleDemoBean beanLifecycleDemoBean=new BeanLifecycleDemoBean();
        return beanLifecycleDemoBean;
    }

    @Bean
    public BeanPostProcessorDemoBean beanPostProcessorDemoBean() {
        return new BeanPostProcessorDemoBean();
    }
}
