package com.interswitch.springapp.config;

import com.interswitch.springapp.model.Greeting;
import com.interswitch.springapp.service.Greet;
import com.interswitch.springapp.service.impl.AfternoonGreeting;
import com.interswitch.springapp.service.impl.MorningGreeting;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig{

    @ConditionalOnProperty(name = "greet.day", havingValue = "morning", matchIfMissing = true)
    @Bean
    public Greet morning(){
        return new MorningGreeting();
    }

    @ConditionalOnProperty(name = "greet.day", havingValue = "afternoon", matchIfMissing = false)
    @Bean
    public Greet afternoon(){
        return new AfternoonGreeting();
    }


    @Bean(name={"myGreeting", "ourGreeting"},  initMethod = "init", destroyMethod = "destroy")
    public Greeting greeting(){
        return new Greeting();
    }

}