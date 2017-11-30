package com.zhaojun

/**
  * Created by zk on 2017/11/30.
  * 作用: com.zhaojun.
  */
class Cat  extends  Animal {

  override def eat() = {
    println("猫正在吃")
    "cat"
  }

  override def fly(): Unit = {
    println("猫不会飞,哈哈哈")
  }
}
