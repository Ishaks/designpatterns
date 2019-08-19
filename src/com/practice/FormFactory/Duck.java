package com.practice.FormFactory;

import com.practice.Methods.FlyBehavior;
import com.practice.Methods.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }
        public abstract void display();

        public void performFly() {
            flyBehavior.fly();
        }

        public void performQuack() {
            quackBehavior.quack();
        }

        public void swim() {
            System.out.println("All ducks swim, even decoys!");
        }

        public void setFlyBehavior(FlyBehavior fb) {
            flyBehavior = fb;
        }

        public void setQuackBehavior(QuackBehavior qb) {
            quackBehavior = qb;
        }
}
