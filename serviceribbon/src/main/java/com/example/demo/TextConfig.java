package com.example.demo;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2018-04-07.
 */
@Configuration
@ExcludeFromComponentScan
public class TextConfig {

    @Bean
    public IRule ribbonIRule(){
        return new RandomRule();
    }
}
