package com.goindow.design.create.factory.method;

import org.junit.Test;

import static org.junit.Assert.*;

public class BmwEngineFactoryTest {

    @Test
    public void create() {
        Engine bmwEngine = new BmwEngineFactory().create();
        bmwEngine.start();
        assertTrue(bmwEngine instanceof BmwEngine);
    }

}