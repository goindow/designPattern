# 简单工厂模式 - SimpleFactoryPattern
定义产品接口，使用工厂类相关方法决定实例化哪一个产品子类

## UML 类图
![simpleFactory_singl](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/UML/simpleFactory_single.png?raw=true)
![simpleFactory_singl](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/UML/simpleFactory_multiple.png?raw=true)

## 解析
> [示例代码](https://github.com/goindow/designPattern/tree/master/src/main/java/com/goindow/design/create/factory/simple)

1. 定义产品接口（引擎）
```java
public interface Engine {
    void start();
}
``` 

2. 实现该接口的多产品子个类
```java
public class BmwEngine implements Engine {
    public void start() { System.out.println("BmwEngine::start()"); }
}

public class BydEngine implements Engine {
    public void start() { System.out.println("BydEngine::start()"); }
}
```

3. 简单工厂类（单方法）
```java
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
```

4. 调用
```java
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
```

可以看到，单方法的简单工厂有一个很大的弊端，如果传递的参数不正确，将返回 null。为了避免这种情况，将单方发改造成多方法，每个方法负责实例化一个类。

3.1. 简单工厂类（多方法）
```java
public class EngineFactory2 {
    public static Engine createBydEngine() { return new BydEngine(); }
    public static Engine createBmwEngine() { return new BmwEngine(); }
}
```

4.1. 调用
```java
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
```

现在能获取到想要的产品子类对象了。考察一下，如果想增加一种 Engine 产品子类，我们需要如何改造？
> 1. 新增一个 Engine 产品子类
> 2. 修改 EngineFactory2，新增对应的实例化方法

可以看见，简单工厂违反了 *"开闭原则"*，不便于扩展。
使用 [工厂方法](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/FactoryMethodPattern.md) 就能很好的避免。

## 相关链接
- [首页](https://github.com/goindow/designPattern)
  - [工厂模式](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/FactoryPattern.md)
    - 简单工厂
    - [工厂方法](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/FactoryMethodPattern.md)
    - [抽象工厂](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/AbstractFactoryPattern.md)

