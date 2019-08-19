package com.practice.FormFactory;

import com.practice.Methods.FlyNoWay;
import com.practice.Methods.Quack;

public class ModelDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I'm a model duck!");
    }

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();

    }
}
