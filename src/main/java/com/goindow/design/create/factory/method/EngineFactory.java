package com.goindow.design.create.factory.method;

/**
 * 工厂方法模式 - 工厂接口
 *
 * 简单工厂模式下，如果需要扩展产品类，必须要修改工厂类，违反了开闭原则
 * 为了避免这种情况，可以抽象出工厂接口，返回产品对象由工厂接口的实现类负责，
 * 这样在扩展产品类时，不需要修改工厂接口，只需要新建对应产品类的工厂类（实现了工厂接口）即可
 * 耦合度更低，增加了扩展性
 * */
public interface EngineFactory {
    Engine create();
}
