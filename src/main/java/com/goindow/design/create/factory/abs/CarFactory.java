package com.goindow.design.create.factory.abs;

import com.goindow.design.create.factory.abs.engine.Engine;
import com.goindow.design.create.factory.abs.gear.Gearbox;

public abstract class CarFactory {

    public abstract Engine createEngine();

    public abstract Gearbox createGearbox();

}
