package com.goindow.design.create.factory.method;

/**
 * 工厂方法模式 - 工厂接口实现类，每个工厂类负责一个产品类的生产
 * */
public class BmwEngineFactory implements EngineFactory {
    public Engine create() {
        return new BmwEngine();
    }
}
