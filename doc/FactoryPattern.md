# 工厂模式 - FactoryPattern
工厂模式一般用来生产符合统一标准（interface/abstract class）的对象

## 解析
> 正如模式名一样，工厂负责生产产品，产品的分类（发动机、变速箱...）有很多，但每种产品最好能有统一的标准，这样一旦有人想生产同样的产品，只需要按照产品标准来生产即可。
[简单工厂](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/SimpleFactoryPattern.md)\/[工厂方法](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/FactoryMethodPattern.md)
就能和好的实现这一目标。


[简单工厂](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/SimpleFactoryPattern.md)\/[工厂方法](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/FactoryMethodPattern.md)
一般用来生产单个类型的产品（发动机工厂、变速箱工厂...），订立单个产品的统一的标准（interface）


> 假设现在需要生产整车，就需要建造汽车工厂，并且需要发动机、变速箱等，要如何组织生产？同样的，汽车工厂可能也不只一家，是不是也需要有一个统一的造车标准？这时候
[抽象工厂](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/AbstractFactoryPattern.md)
(宝马汽车工厂、比亚迪汽车工厂...)就派上了用场。


[抽象工厂](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/AbstractFactoryPattern.md)
又叫做超级工厂/工厂的工厂，是对工厂模式更高级别的抽象，主要目的是用来解决组合问题，将多种类型的产品（多个工厂生产的产品）组合起来变成新的产品，订立新产品的统一标准（abstract class）


更多细节，详见下列表

## 常见的子模式
- [简单工厂](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/SimpleFactoryPattern.md)
- [工厂方法](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/FactoryMethodPattern.md)
- [抽象工厂](https://github.com/goindow/designPattern/blob/master/doc/factoryPattern/AbstractFactoryPattern.md) 