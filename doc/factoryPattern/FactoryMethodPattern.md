# 工厂方法模式
定义工厂接口，使用工厂子类决定实例化哪一个产品子类

## UML 类图
![simpleFactory_singl](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/UML/FactoryMethod.png?raw=true)


## 解析
> [示例代码](https://github.com/goindow/designPattern/tree/master/src/main/java/com/goindow/design/create/factory/method)

1. 定义一套产品接口（引擎）
```java
public interface Engine {
    void start();
}
``` 

2. 实现该接口的多个产品子类
```java
public class BmwEngine implements Engine {
    public void start() { System.out.println("BmwEngine::start()"); }
}

public class BydEngine implements Engine {
    public void start() { System.out.println("BydEngine::start()"); }
}
```

3. 定义工厂接口
```java
public interface EngineFactory {
    Engine create();
}
```

4. 实现该接口的多个工厂子类
```java
public class BmwEngineFactory implements EngineFactory {
    public Engine create() { return new BmwEngine(); }
}

public class BydEngineFactory implements EngineFactory {
    public Engine create() { return new BydEngine(); }
}
```

5. 调用
```java
public class BmwEngineFactoryTest {
    @Test
    public void create() {
        Engine bmwEngine = new BmwEngineFactory().create();
        bmwEngine.start();
        assertTrue(bmwEngine instanceof BmwEngine);
    }
}

public class BydEngineFactoryTest {
    @Test
    public void create() {
        Engine bydEngine = new BydEngineFactory().create();
        bydEngine.start();
        assertTrue(bydEngine instanceof BydEngine);
    }
}
```

考察一下，如果想增加一种 Engine 产品子类，我们需要如何改造？
> 1. 新增一个 Engine 产品子类
> 2. 新增对应的 EngineFactory 工厂子类

可以看见，只需要新增产品和工厂子类即可完成扩展，而不需要修改原有代码，符合 *"开闭原则"* 的要求，故应当尽量使用 **工厂方法模式**，
简单工厂模式只是为了说明 *工厂方法模式* 的开闭原则

考察一下，假设现在需要生产整车，就需要建造汽车工厂，并且需要发动机、变速箱等，要如何组织生产？同样的，汽车工厂可能也不只一家，是不是也需要有一个统一的造车标准？这时候
[抽象工厂](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/AbstractFactoryPattern.md)
(宝马汽车工厂、比亚迪汽车工厂...)就派上了用场。

## 相关链接
- [工厂模式](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/FactoryPattern.md)
  - [简单工厂](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/SimpleFactoryPattern.md)
  - 工厂方法
  - [抽象工厂](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/AbstractFactoryPattern.md)

