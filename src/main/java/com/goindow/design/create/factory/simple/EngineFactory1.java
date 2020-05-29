package com.goindow.design.create.factory.simple;

/**
 * 简单工厂模式 - 单方法/静态方法
 * */
public class EngineFactory1 {

    public static Engine create(String engineName) {
        switch (engineName.toLowerCase()) {
            case "byd":
                return new BydEngine();
            case "bmw":
                return new BmwEngine();
            default:
                return null;
        }
    }

}
