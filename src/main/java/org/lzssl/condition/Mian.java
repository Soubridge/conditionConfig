package org.lzssl.condition;

import org.lzssl.moreEnvironment.DateSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mian {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        ShowCmd cmd = (ShowCmd) ctx.getBean("cmd");
        ShowCmd cmd1 = (ShowCmd) ctx.getBean("cmd");
        //System.out.println("cmd = " + cmd.showCmd());
        System.out.println(cmd1 == cmd);

//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig1.class);
//        DateSource devDs = ctx.getBean("testDs", DateSource.class);
//        System.out.println("devDs = " + devDs);

    }
}
