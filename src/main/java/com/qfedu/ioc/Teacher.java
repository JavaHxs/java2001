package com.qfedu.ioc;

/**
 * @Author HXS
 * @Date 2020/7/15 20:05
 * @Version 1.0
 */
public class Teacher {


    public Water water;

    public void drink(){
        System.out.println("老师喝"+water.getType());
    }
}
