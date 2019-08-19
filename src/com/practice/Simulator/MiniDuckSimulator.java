package com.practice.Simulator;

import com.practice.FormFactory.Duck;
import com.practice.FormFactory.MallardDuck;
import com.practice.FormFactory.ModelDuck;
import com.practice.Methods.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String args[]) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
