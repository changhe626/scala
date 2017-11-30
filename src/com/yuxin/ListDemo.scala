package com.yuxin

/**
  * Created by zk on 2017/11/30.
  * 作用: com.yuxin.
  */
object ListDemo extends  App {

  val p1=9::(5::(2::Nil))
  val p2=9::5::2::List()

  println(p1)
  println(p2)

}
