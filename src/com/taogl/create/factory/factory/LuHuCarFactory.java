package com.taogl.create.factory.factory;

import com.taogl.create.factory.car.Engine;
import com.taogl.create.factory.car.SeniorEngine;
import com.taogl.create.factory.car.SeniorTire;
import com.taogl.create.factory.car.Tire;

public class LuHuCarFactory extends CarFactory{

    @Override
    public Tire createTire() {
        return new SeniorTire();
    }

    @Override
    public Engine createEngine() {
        return new SeniorEngine();
    }
}
