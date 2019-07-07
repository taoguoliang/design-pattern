package com.taogl.create.factory.factory;

import com.taogl.create.factory.car.Engine;
import com.taogl.create.factory.car.NormalTire;
import com.taogl.create.factory.car.SeniorEngine;
import com.taogl.create.factory.car.Tire;

public class AudiCarFactory extends CarFactory {
    @Override
    public Tire createTire() {
        return new NormalTire();
    }

    @Override
    public Engine createEngine() {
        return new SeniorEngine();
    }
}
