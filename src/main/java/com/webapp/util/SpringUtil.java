package com.webapp.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public  class SpringUtil {
    private static ApplicationContext ac = null;
    static {
        ac = new ClassPathXmlApplicationContext("config/spring/ApplicationContext.xml");
    }
    public static ApplicationContext  CreateInstance()
    {
        return ac ;
    }
}
