package com.zhaojun

/**
  * Created by zk on 2017/11/30.
  * 作用: com.zhaojun.
  */
class Dog extends Animal {
  override def eat() = {
    println("dog is eat")
    "dog"
  }

  override def drink(name: String): Unit = ???
}

object Dog{

  def main(args: Array[String]): Unit = {
    val d=new Dog
    d.eat()
    d.fly()

    //这就是单例了
    val d1=Dog
    val d2=Dog
    println(d1==d2)

  }
}
