package com.goindow.design.create.factory.abs;

import com.goindow.design.create.factory.abs.engine.BydEngine;
import com.goindow.design.create.factory.abs.engine.Engine;
import com.goindow.design.create.factory.abs.gear.BydGearbox;
import com.goindow.design.create.factory.abs.gear.Gearbox;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BydCarFactoryTest {

    private BydCarFactory bydCarFactory;

    @Before
    public void setUp() throws Exception {
        bydCarFactory = new BydCarFactory();
    }

    @Test
    public void createEngine() {
        Engine bydEngine = bydCarFactory.createEngine();
        bydEngine.start();
        assertTrue(bydEngine instanceof BydEngine);
    }

    @Test
    public void createGearbox() {
        Gearbox bydGearbox = bydCarFactory.createGearbox();
        bydGearbox.gear();
        assertTrue(bydGearbox instanceof BydGearbox);
    }
}