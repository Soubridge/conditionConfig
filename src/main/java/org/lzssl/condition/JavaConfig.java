package org.lzssl.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class JavaConfig {
    @Bean("cmd")
    @Scope("prototype")
    @Conditional(WindowsCondition.class)
    ShowCmd winCmd(){
        return new WindowsShowCmd();
    }

    @Bean("cmd")
    @Conditional(LinuxCondition.class)
    ShowCmd linuxCmd(){
        return new LinuxShowCmd();
    }
}
