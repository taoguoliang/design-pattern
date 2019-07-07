package com.taogl.create.builder;

public class FruitFactor {

    public Fruit constructFruit(FruitBuilder fruitBuilder) {
        return fruitBuilder
                .buildColor()
                .buildPrice()
                .buildShape()
                .buildSize()
                .buildFruit();
    }
}
