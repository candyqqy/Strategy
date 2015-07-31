package com.strategy.example;

/**
 * Created by qqy on 15/7/31.
 */
public class main {
    public static void main(String[] args){

        Context context;

        context=new Context(new ConcreteStrategyA());
        context.ContextInterface();

        context=new Context(new ConcreteStrategyB());
        context.ContextInterface();

        context=new Context(new ConcreteStrategyC());
        context.ContextInterface();
    }
}
