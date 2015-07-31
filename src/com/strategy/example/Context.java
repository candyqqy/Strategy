package com.strategy.example;

/**
 * Created by qqy on 15/7/31.
 */

//上下文Context，用一个ConcreteStrategy来配置，维护一个对Strategy对象引用
public class Context {
    Strategy strategy;
    public Context(Strategy strategy)//初始化时，传入具体的策略对象
    {
        this.strategy=strategy;
    }

    //上下文接口
    public void ContextInterface(){//根据具体的策略对象，调用其算法的方法
        strategy.AlgorithmInterface();
    }
}
