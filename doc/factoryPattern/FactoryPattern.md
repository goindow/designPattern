# 工厂模式 - FactoryPattern
- [简单工厂](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/SimpleFactoryPattern.md)，定义产品接口，使用工厂类相关方法决定实例化哪一个产品子类
- [工厂方法](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/FactoryMethodPattern.md)，定义工厂接口，使用工厂子类决定实例化哪一个产品子类
- [抽象工厂](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/AbstractFactoryPattern.md)，定义 *"为创建一组相关/相互依赖的产品子类的"* 工厂抽象类，使用工厂子类决定如何组合和实例化产品子类，且无需指定它们的具体类。

> [简单工厂](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/SimpleFactoryPattern.md)\/[工厂方法](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/FactoryMethodPattern.md) 和
> [抽象工厂](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/AbstractFactoryPattern.md) 可以认为是两种不同的设计模式

## 解析
正如模式名一样，工厂负责生产产品，产品的分类（发动机、变速箱...）有很多，但每种产品最好能有统一的标准，这样一旦有人想生产同样的产品，只需要按照产品标准来生产即可。
[简单工厂](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/SimpleFactoryPattern.md)\/[工厂方法](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/FactoryMethodPattern.md)
就能和好的实现这一目标。

> [简单工厂](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/SimpleFactoryPattern.md)\/[工厂方法](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/FactoryMethodPattern.md)
一般用来生产单个类型的产品（发动机工厂、变速箱工厂...），订立单个产品的统一的标准（interface）。

<br/>

假设现在需要生产整车，就需要建造汽车工厂，并且需要发动机、变速箱等，要如何组织生产？同样的，汽车工厂可能也不只一家，是不是也需要有一个统一的造车标准？这时候
[抽象工厂](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/AbstractFactoryPattern.md)
(宝马汽车工厂、比亚迪汽车工厂...)就派上了用场。

> [抽象工厂](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/AbstractFactoryPattern.md)
又叫做 *超级工厂/工厂的工厂*，是对工厂模式更高级别的抽象，主要目的是用来 **解决组合问题**，将一组相关/相互依赖的产品组合起来变成新的产品，订立新产品的统一标准（abstract class）。

<br/>
详见，

## 相关链接
- 工厂模式
  - [简单工厂](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/SimpleFactoryPattern.md)
  - [工厂方法](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/FactoryMethodPattern.md)
  - [抽象工厂](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/AbstractFactoryPattern.md)