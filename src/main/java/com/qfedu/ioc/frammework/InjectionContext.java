package com.qfedu.ioc.frammework;

/**
 * @Author HXS
 * @Date 2020/7/15 19:31
 * @Version 1.0
 */

import com.qfedu.ioc.annotation.Autowired;

import java.lang.reflect.Field;

/**
 * 秘书   ：自定义框架
 */
public class InjectionContext {

 public static  <T> T genBean(Class<T> leaderClass){
     try {
         //通过反射给Leader中的Water变量赋值
//         Class<Leader> leaderClass = Leader.class;
         //获取所有属性
         Field[] declaredFields = leaderClass.getDeclaredFields();
         T leader = leaderClass.newInstance();
         //找到Water
         for (int i =0;i<declaredFields.length;i++){
             Field field = declaredFields[i];

             //允许私有属性通过反射进行赋值
             field.setAccessible(true);

             //获取属性上是否有Autowired注解
             Autowired annotation = field.getAnnotation(Autowired.class);
             if(annotation !=null){

                 Class aClass = field.getType();
                 //参数1：属性所有者
                 field.set(leader,aClass.newInstance());

             }


             //declaredFields[i].getName() 获取当前属性名称
//             if("water".equals(field.getName())){
//                 //给Water属性赋值
//                 //参数1：属性所有者
//                 field.set(leader,new Water());
//             }
         }
         return leader;
     }catch (InstantiationException e){
         e.printStackTrace();
     }catch (IllegalAccessException e){
         e.printStackTrace();
     }
     return null;
 }
}
