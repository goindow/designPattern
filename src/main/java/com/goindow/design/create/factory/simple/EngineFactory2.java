package com.goindow.design.create.factory.simple;

/**
 * 简单工厂模式 - 多方法/静态方法
 *
 * 单方法/静态方法下，需要调用者传递正确的参数才能返回对象，为了避免这种情况，为每个产品类使用对应的一个方法生产产品对象
 * */
public class EngineFactory2 {

    public static Engine createBydEngine() {
        return new BydEngine();
    }

    public static Engine createBmwEngine() {
        return new BmwEngine();
    }

}
