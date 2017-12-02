package com.yuxin

/**
  * Created by zk on 2017/12/2.
  * 作用: com.yuxin.
  */
object OptionDemo extends App{

  val map=Map("1"->2,"3"->"4",("a","b"))
  println(map)

  val l=map("1")
//  val l2=map("4")  //报错
  val l3=map.getOrElse("4",OptionDemo)
  println(l3)

  val l4=map.get("1")
  println(l4)  //Some(2)
  val l5=map.get("4")
  println(l5)

}
