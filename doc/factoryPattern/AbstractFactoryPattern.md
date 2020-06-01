# 抽象工厂模式
定义 *"为创建一组相关/相互依赖的产品子类的"* 工厂抽象类，使用工厂子类决定如何组合和实例化产品子类，且无需指定它们的具体类。

## UML 类图
![simpleFactory_singl](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/UML/abstractFactory.png?raw=true)

## 解析
> [示例代码](https://github.com/goindow/designPattern/tree/master/src/main/java/com/goindow/design/create/factory/abs)

1. 定义多个产品接口（引擎、变速箱...）
```java
// Engine
public interface Engine {
    void start();
}

// Gearbox
public interface Gearbox {
    void gear();
}
``` 

2. 实现这些接口的多个产品子类
```java
// Engine
public class BmwEngine implements Engine {
    public void start() { System.out.println("BmwEngine::start()"); }
}

public class BydEngine implements Engine {
    public void start() { System.out.println("BydEngine::start()"); }
}


// Gearbox
public class BmwGearbox implements Gearbox {
    public void gear() { System.out.println("BmwGearbox::gear()"); }
}

public class BydGearbox implements Gearbox {
    public void gear() { System.out.println("BydGearbox::gear()"); }
}
```

3. 定义抽象工厂类
```java
public abstract class CarFactory {
    public abstract Engine createEngine();
    public abstract Gearbox createGearbox();
}
```

4. 实现该抽象类的多个工厂子类
```java
// BMW
public class BmwCarFactory extends CarFactory {
    @Override
    public Engine createEngine() { return new BmwEngine(); }

    @Override
    public Gearbox createGearbox() { return new BmwGearbox(); }
}


// BYD
public class BydCarFactory extends CarFactory {
    @Override
    public Engine createEngine() { return new BydEngine(); }

    @Override
    public Gearbox createGearbox() { return new BydGearbox(); }
}
```

5. 调用
```java
// BMW
public class BmwCarFactoryTest {

    private BmwCarFactory bmwCarFactory;

    @Before
    public void setUp() throws Exception { bmwCarFactory = new BmwCarFactory(); }

    @Test
    public void createEngine() {
        Engine bmwEngine = bmwCarFactory.createEngine();
        bmwEngine.start();
        assertTrue(bmwEngine instanceof BmwEngine);
    }

    @Test
    public void ceateGearbox() {
        Gearbox bmwGearbox = bmwCarFactory.createGearbox();
        bmwGearbox.gear();
        assertTrue(bmwGearbox instanceof BmwGearbox);
    }
}


// BYD
public class BydCarFactoryTest {

    private BydCarFactory bydCarFactory;

    @Before
    public void setUp() throws Exception { bydCarFactory = new BydCarFactory(); }

    @Test
    public void createEngine() {
        Engine bydEngine = bydCarFactory.createEngine();
        bydEngine.start();
        assertTrue(bydEngine instanceof BydEngine);
    }

    @Test
    public void createGearbox() {
        Gearbox bydGearbox = bydCarFactory.createGearbox();
        bydGearbox.gear();
        assertTrue(bydGearbox instanceof BydGearbox);
    }
}
```

可以看见，当需要 *创建一组相关/相互依赖的产品子类* 的时候，可以使用 **抽象工厂模式** 来组合和实例化这些产品子类，且无需指定它们的具体类。

- 考察一下，如果想增加一种 Engine/Gearbox 产品子类，如何方便扩展？
> 可以使用 **工厂方法模式** 来生产单个产品，它符合 *"开闭原则"*，便于扩展

- 再考察一下，如果想增加一种产品类型（比如，底盘），如何扩展？
> 可以使用 **工厂方法模式** 来生产单个产品，它符合 *"开闭原则"*，便于扩展

- 再考察一下，如果想增加一个工厂(比如，奥迪)，如何扩展？这里的情况比较复杂
> 抽象工厂类 CarFactory 是否有新增的产品类型（比如，底盘）？
> 1. false，直接新增一个 CarFactory 子类即可（AudiCarFactory）
> 2. true，现有的工厂子类（比如，BmwCarFactory/BydCarFactory）是否也需要新增的产品类型（比如，底盘）？
>   2.1. false，那么直接新增一个抽象工厂类（比如，CarFactory2），再新增一个 CarFactory2 子类即可
>   2.2. true，这种情况下必定要违反 *"开闭原则"*，修改现有代码了

## 相关链接
- [工厂模式](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/FactoryPattern.md)
  - [简单工厂](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/SimpleFactoryPattern.md)
  - [工厂方法](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/FactoryMethodPattern.md)
  - 抽象工厂


