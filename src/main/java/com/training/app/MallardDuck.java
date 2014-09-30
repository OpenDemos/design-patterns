package com.training.app;

public class MallardDuck extends Duck {
    public MallardDuck() {
     quackBehavior = new Quack();
     flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.print("Mallard Duck");
    }
}