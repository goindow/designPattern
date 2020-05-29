package com.goindow.design.create.factory.abs;

import com.goindow.design.create.factory.abs.engine.BydEngine;
import com.goindow.design.create.factory.abs.engine.Engine;
import com.goindow.design.create.factory.abs.gear.BydGearbox;
import com.goindow.design.create.factory.abs.gear.Gearbox;

public class BydCarFactory extends CarFactory {
    @Override
    public Engine createEngine() {
        return new BydEngine();
    }

    @Override
    public Gearbox createGearbox() {
        return new BydGearbox();
    }
}
