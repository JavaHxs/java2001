package com.qfedu.ioc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author HXS
 * @Date 2020/7/15 20:15
 * @Version 1.0
 */

@Retention(RetentionPolicy.RUNTIME)  // 表示自定义的注解在程序运行期间有效
@Target(ElementType.FIELD)   //表示自定义的注解只能作用在属性上面
public @interface Autowired {

    //Class value();   // 等于注解中的属性

}
