package com.molruexception;

import com.molruexception.observer1.MallardDuck;
import com.molruexception.observer1.Quackologist;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. -----------------------------");
        simulateTypeA();
        System.out.println("--------------------------------");


    }

    private static void simulateTypeA() {
        MallardDuck duck = new MallardDuck();
        Quackologist quackologist = new Quackologist();
        duck.registerObserver(quackologist);
        duck.quack();
    }

    private static void simulatedTypeB() {

    }

}