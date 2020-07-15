package com.qfedu.ioc;

/**
 * @Author HXS
 * @Date 2020/7/15 20:50
 * @Version 1.0
 */

import com.qfedu.ioc.annotation.Component;

import java.io.File;
import java.net.URL;

/**
 * 1.找到所有的标注有@compoent注解的类
 */
public class Test2 {

    public static void main(String[] args) throws ClassNotFoundException {

        String basePackage = "com.qfedu.ioc";
        URL resource = Test2.class.getResource("/");

        System.out.println(resource.getPath());

        String resourcePath = resource.getPath();
        String replaceAll = basePackage.replaceAll(".","/");
        String path = resourcePath+replaceAll;


        //通过此类获取当前路径下有哪些文件
        File file = new File(path);
        File[] files = file.listFiles();
        for (File f:files){
            String name = f.getName();
            //获取java源文件
            if(f.isFile() && name.endsWith(".class")){
                //找到哪些类上面有Component
                Class<?> aClass = Class.forName(basePackage + "." + name);
                Component annotation = aClass.getAnnotation(Component.class);
                if (annotation !=null){
                    System.out.println(aClass.getName());
                }


                //在有Component注解类上找到他们的父类或者接口


            }
        }
    }
}
