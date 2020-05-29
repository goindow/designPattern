package com.goindow.design.create.factory.method;

import org.junit.Test;

import static org.junit.Assert.*;

public class BydEngineFactoryTest {

    @Test
    public void create() {
        Engine bydEngine = new BydEngineFactory().create();
        bydEngine.start();
        assertTrue(bydEngine instanceof BydEngine);
    }
}