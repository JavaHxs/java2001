package com.qfedu.ioc;

import com.qfedu.ioc.annotation.Component;

/**
 * @Author HXS
 * @Date 2020/7/15 19:28
 * @Version 1.0
 */
@Component
public class Water implements IWater{

    private String type;

    public String getType() {
        return "白开水";
    }

    public void setType(String type) {
        this.type = type;
    }
}
