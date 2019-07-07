package com.taogl.create.builder;

import java.math.BigDecimal;

public class BananaBuilder implements FruitBuilder {
    private Fruit fruit;

    BananaBuilder() {
        fruit = new Fruit();
    }

    @Override
    public FruitBuilder buildColor() {
        System.out.println("香蕉颜色是黄色");
        fruit.setColor("yellow");
        return this;
    }

    @Override
    public FruitBuilder buildShape() {
        System.out.println("香蕉形状是长条");
        fruit.setShape("long");
        return this;
    }

    @Override
    public FruitBuilder buildSize() {
        System.out.println("香蕉的尺寸为0.2");
        fruit.setSize(BigDecimal.valueOf(0.2));
        return this;
    }

    @Override
    public FruitBuilder buildPrice() {
        System.out.println("香蕉的价格为4.5");
        fruit.setPrice(BigDecimal.valueOf(4.5));
        return this;
    }

    @Override
    public Fruit buildFruit() {
        System.out.println("香蕉构造成功");
        return fruit;
    }
}
