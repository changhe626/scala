package com.zhaojun

/**
  * Created by zk on 2017/11/30.
  * 作用: com.zhaojun.
  */
//类的第一个必须是extends 不管后面是抽象类还是特质
class Duck  extends Eat {
  override def eat() = {
    println("duck is eating,thannk you very much")
    "duck"
  }
}


//实现特质,要用with了
class Chicken extends Eat with Fly{
  override def eat() = "chick is eating ,thank you "

  //重写抽象方法必须加上 override ,重写非抽象方法可以加也可以不加的
}
