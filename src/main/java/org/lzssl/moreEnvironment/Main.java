package org.lzssl.moreEnvironment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        m1();
//        m2();
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext();
        ctx.getEnvironment().setActiveProfiles("prod");
        ctx.setConfigLocation("applicationContext.xml");
        ctx.refresh();
        DateSource ds = (DateSource) ctx.getBean("prodDs");
        DateSource ds1 = (DateSource) ctx.getBean("prodDs");
        System.out.println(ds == ds1);

    }

    private static void m2() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext();
        ctx.getEnvironment().setActiveProfiles("prod");
        ctx.setConfigLocation("applicationContext.xml");
        ctx.refresh();
//        DateSource ds = ctx.getBean(DateSource.class);
//        System.out.println("ds = " + ds);
        //注意加上了多环境(Profiles)限制，那些没有加环境限制的依旧可以被加载进来
        DateSource ds = (DateSource) ctx.getBean("testDs");
        System.out.println("ds = " + ds);
    }

    private static void m1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("prod");
        ctx.register(JavaConfig.class);
        ctx.refresh();
        DateSource ds = ctx.getBean(DateSource.class);
        System.out.println("ds = " + ds);

//        DateSource testDs = ctx.getBean("testDs", DateSource.class);
//        System.out.println("testDs = " + testDs);
    }
}
