package com.qfedu.ioc;

import com.qfedu.ioc.annotation.Autowired;

/**
 * @Author HXS
 * @Date 2020/7/15 19:30
 * @Version 1.0
 */

//领导
public class Leader {

    @Autowired
    public Water water;

    @Autowired
    private Coffee coffee;
    /**
     * 喝水
     */
    public void drink(){
        System.out.println("喝"+water.getType());
    }
}
