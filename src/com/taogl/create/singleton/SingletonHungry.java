package com.taogl.create.singleton;

public class SingletonHungry {
    private SingletonHungry() {}

    private static SingletonHungry singletonHungry = new SingletonHungry();

    public static SingletonHungry getInstance(){
        return singletonHungry;
    }
}
