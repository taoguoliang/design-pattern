package com.taogl.create.builder;

public interface FruitBuilder {
    FruitBuilder buildColor();

    FruitBuilder buildShape();

    FruitBuilder buildSize();

    FruitBuilder buildPrice();

    Fruit buildFruit();
}
