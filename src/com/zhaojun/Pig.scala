package com.zhaojun

/**
  * Created by zk on 2017/11/30.
  * 作用: com.zhaojun.
  */
class Pig {

}

object  Pig{
  //在new完对象的时候,动态的实现特质,却是很强大的

  def main(args: Array[String]): Unit = {
    val p1=new Pig with Eat {
      override def eat(): String = "pig is eating now"
    }
    println(p1.eat())

    val p2=new Pig with Fly

    p2.fly()
  }

}
