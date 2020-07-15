package com.qfedu.ioc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author HXS
 * @Date 2020/7/15 20:48
 * @Version 1.0
 */
@Target(ElementType.TYPE)    //作用在类上
@Retention(RetentionPolicy.RUNTIME)
public @interface Component {
}
