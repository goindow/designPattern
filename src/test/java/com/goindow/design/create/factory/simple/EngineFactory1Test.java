package com.goindow.design.create.factory.simple;

import org.junit.Test;

import static org.junit.Assert.*;

public class EngineFactory1Test {

    @Test
    public void create() {
        Engine bydEngine = EngineFactory1.create("byd");
        bydEngine.start();
        assertTrue(bydEngine instanceof BydEngine);

        Engine bmwEngine = EngineFactory1.create("bmw");
        bmwEngine.start();
        assertTrue(bmwEngine instanceof BmwEngine);
    }
}