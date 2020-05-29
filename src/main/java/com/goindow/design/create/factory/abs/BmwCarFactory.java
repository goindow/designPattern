package com.goindow.design.create.factory.abs;

import com.goindow.design.create.factory.abs.engine.BmwEngine;
import com.goindow.design.create.factory.abs.engine.Engine;
import com.goindow.design.create.factory.abs.gear.BmwGearbox;
import com.goindow.design.create.factory.abs.gear.Gearbox;

public class BmwCarFactory extends CarFactory {
    @Override
    public Engine createEngine() {
        return new BmwEngine();
    }

    @Override
    public Gearbox createGearbox() {
        return new BmwGearbox();
    }
}
