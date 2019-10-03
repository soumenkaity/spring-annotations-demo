package com.stackroute;

import com.stackroute.config.Config;
import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        BeanLifecycleDemoBean beanLifecycleDemoBean = context.getBean(BeanLifecycleDemoBean.class);

        Movie movie = context.getBean("movie", Movie.class);
        System.out.println(movie);

        context.registerShutdownHook();
    }
}
