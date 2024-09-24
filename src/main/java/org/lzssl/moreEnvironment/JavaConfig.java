package org.lzssl.moreEnvironment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
public class JavaConfig {
    @Bean
    @Profile("dev")
    DateSource devDs(){
        DateSource ds = new DateSource();
        ds.setUrl("jdbc:mysql:///vhr");
        ds.setUsername("root");
        ds.setPassword("123");
        return ds;
    }


    @Bean
    @Profile("prod")
    DateSource prodDs(){
        DateSource ds = new DateSource();
        ds.setUrl("jdbc:mysql://192.168.72.36/vhr");
        ds.setUsername("root");
        ds.setPassword("sdxscd");
        return ds;
    }

    @Bean
    DateSource testDs(){
        DateSource ds = new DateSource();
        ds.setUrl("jdbc:mysql://192.168.72.36/vhr");
        ds.setUsername("root");
        ds.setPassword("sdxscd");
        return ds;
    }
}
