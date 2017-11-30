package com.zhaojun

/**
  * Created by zk on 2017/11/30.
  * 作用: com.zhaojun.
  */
class Person {



}

/**
  * apply 方法的演示
  */
object Person{

  def main(args: Array[String]): Unit = {
    val p=Person(1,4)
    println(p)

    val arr=Array(1,4,6)
    println(arr.toBuffer)
  }



  def apply(x:Int,y:Int):String={
    x+y+""
  }


}
