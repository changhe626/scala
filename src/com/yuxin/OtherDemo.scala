package com.yuxin

/**
  * Created by zk on 2017/12/2.
  * 作用: com.yuxin.
  */
object OtherDemo extends App{

  println("object 继承了App,可以直接执行")

  println(1 to 10)
  println(1 until 4)

  val list=List(1,2,3,5,6,73,43,7,3,5)
  //并行计算
  println(list.par.reduce(_+_))
  println(list.par.fold(100)(_+_))

  //可变参数
  def hi(id:Int*)={
    for(i<-id) println(i)
  }





}
