package com.fp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class FifthPillarMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("fifth_pillar_home");
        registry.addViewController("/home").setViewName("fifth_pillar_home");
        registry.addViewController("/mentor").setViewName("pages/mentor");
        registry.addViewController("/team").setViewName("pages/team");
        registry.addViewController("/contact").setViewName("Contact");
        registry.addViewController("/service").setViewName("pages/services");
        registry.addViewController("/organization-structure").setViewName("pages/organization-structure");
        registry.addViewController("/join-us").setViewName("pages/joinus");

        registry.addViewController("/worldofhonesty/home").setViewName("who/world_of_honesty_home");
        
        
        registry.addViewController("/hindi").setViewName("hindi/fifth_pillar_home");
        registry.addViewController("/hindi/home").setViewName("hindi/fifth_pillar_home");
    }

    // @Bean(name = "dataSource")
    //
    // public DriverManagerDataSource dataSource() {
    // DriverManagerDataSource driverManagerDataSource = new
    // DriverManagerDataSource();
    // driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
    // driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/userbase");
    // driverManagerDataSource.setUsername("root");
    // driverManagerDataSource.setPassword("root");
    // return driverManagerDataSource;
    // }

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}