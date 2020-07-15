package com.qfedu.ioc;

import com.qfedu.ioc.annotation.Component;

/**
 * @Author HXS
 * @Date 2020/7/15 20:13
 * @Version 1.0
 */

@Component
public class Coffee implements IWater{

    public String getType(){
        return "拿铁";
    }
}
