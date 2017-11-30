package com.zhaojun

/**
  * Created by zk on 2017/11/29.
  * 作用: .
  */
class Student {

  private var id=1
  var name="zhaojun"
  val age=34
  private[this] val addres="suizhou"


}
object StudentDemo{
  def main(args: Array[String]): Unit = {
    val s=new Student
    println(s.name)
    s.name="zk"
    println(s.name)
    println(s.age)


  }

}
