package com.goindow.design.create.factory.simple;

import org.junit.Test;

import static org.junit.Assert.*;

public class EngineFactory2Test {

    @Test
    public void createBydEngine() {
        Engine bydEngine = EngineFactory2.createBydEngine();
        bydEngine.start();
        assertTrue(bydEngine instanceof BydEngine);
    }

    @Test
    public void createBmwEngine() {
        Engine bmwEngine = EngineFactory2.createBmwEngine();
        bmwEngine.start();
        assertTrue(bmwEngine instanceof BmwEngine);
    }
}