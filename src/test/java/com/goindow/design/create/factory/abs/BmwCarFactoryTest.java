package com.goindow.design.create.factory.abs;

import com.goindow.design.create.factory.abs.engine.BmwEngine;
import com.goindow.design.create.factory.abs.engine.Engine;
import com.goindow.design.create.factory.abs.gear.BmwGearbox;
import com.goindow.design.create.factory.abs.gear.Gearbox;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BmwCarFactoryTest {

    private BmwCarFactory bmwCarFactory;

    @Before
    public void setUp() throws Exception {
        bmwCarFactory = new BmwCarFactory();
    }

    @Test
    public void createEngine() {
        Engine bmwEngine = bmwCarFactory.createEngine();
        bmwEngine.start();
        assertTrue(bmwEngine instanceof BmwEngine);
    }

    @Test
    public void ceateGearbox() {
        Gearbox bmwGearbox = bmwCarFactory.createGearbox();
        bmwGearbox.gear();
        assertTrue(bmwGearbox instanceof BmwGearbox);
    }
}