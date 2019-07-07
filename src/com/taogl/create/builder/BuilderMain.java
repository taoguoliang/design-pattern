package com.taogl.create.builder;

public class BuilderMain {
    public static void main(String[] args) {
        FruitBuilder appleBuilder = new AppleBuilder();
        FruitBuilder bananaBuilder = new BananaBuilder();

        FruitFactor fruitFactor = new FruitFactor();
        fruitFactor.constructFruit(appleBuilder);
        fruitFactor.constructFruit(bananaBuilder);
    }
}
