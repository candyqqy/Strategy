package com.strategy.example;

/**
 * Created by qqy on 15/7/31.
 */

//ConcreteStrategy，封装了具体算法或行为，继承于Strategy
//具体算法A
public class ConcreteStrategyA extends Strategy {

    //算法A实现方法
    @Override
    public void AlgorithmInterface() {
        System.out.println("算法实现A");

    }
}
