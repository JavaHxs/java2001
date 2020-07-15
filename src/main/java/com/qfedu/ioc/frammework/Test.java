package com.qfedu.ioc.frammework;

import com.qfedu.ioc.Leader;
import com.qfedu.ioc.Teacher;

/**
 * @Author HXS
 * @Date 2020/7/15 19:56
 * @Version 1.0
 */
public class Test {
    
    public static void main(String[] args){
        Teacher teacher = InjectionContext.genBean(Teacher.class);
        teacher.drink();

        Leader bean = InjectionContext.genBean(Leader.class);
        bean.drink();

//        Class<?>[] classes = IWater.class.getClasses();
//        System.out.println(classes);
    }
}
