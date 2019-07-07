package com.taogl.create.builder;

import java.math.BigDecimal;

public class AppleBuilder implements FruitBuilder {

    private Fruit fruit;

    AppleBuilder() {
        fruit = new Fruit();
    }

    @Override
    public FruitBuilder buildColor() {
        System.out.println("苹果颜色是红色");
        fruit.setColor("red");
        return this;
    }

    @Override
    public FruitBuilder buildShape() {
        System.out.println("苹果形状是圆形");
        fruit.setShape("circle");
        return this;
    }

    @Override
    public FruitBuilder buildSize() {
        System.out.println("苹果的尺寸为0.5");
        fruit.setSize(BigDecimal.valueOf(0.5));
        return this;
    }

    @Override
    public FruitBuilder buildPrice() {
        System.out.println("苹果的价格为8");
        fruit.setPrice(BigDecimal.valueOf(8));
        return this;
    }

    @Override
    public Fruit buildFruit() {
        System.out.println("苹果构造成功");
        return fruit;
    }
}
