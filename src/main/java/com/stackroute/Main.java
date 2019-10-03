package com.stackroute;

import com.stackroute.config.Config;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Movie movie = context.getBean("movie", Movie.class);
        System.out.println(movie);

        Movie moviea = context.getBean("moviea", Movie.class);
        Movie movieb = context.getBean("movieb", Movie.class);
        System.out.println("For singleton scope (moviea == movieb) : "+(moviea == movieb));

        Movie movieA = context.getBean("movieA", Movie.class);
        Movie movieB = context.getBean("movieB", Movie.class);
        System.out.println("For prototype scope (movieA == movieB) : "+(movieA == movieB));
    }
}
