package com.taogl.create.factory;

import com.taogl.create.factory.factory.AudiCarFactory;
import com.taogl.create.factory.factory.CarFactory;
import com.taogl.create.factory.factory.LuHuCarFactory;

import java.util.Arrays;
import java.util.List;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        List<CarFactory> list = Arrays.asList(new AudiCarFactory(), new LuHuCarFactory());
        list.forEach(carFactory -> {
            carFactory.createTire().tire();
            carFactory.createEngine().engine();
        });
    }
}
