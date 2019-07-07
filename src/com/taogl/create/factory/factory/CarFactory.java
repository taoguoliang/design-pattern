package com.taogl.create.factory.factory;

import com.taogl.create.factory.car.Engine;
import com.taogl.create.factory.car.Tire;

public abstract class CarFactory {
    public abstract Tire createTire();

    public abstract Engine createEngine();
}
