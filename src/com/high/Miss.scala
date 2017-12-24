package com.high

/**
  * Created by zk on 2017/12/3.
  * 作用: com.high.
  * 柯里化实现隐士转换
  */
class Miss[T] {

  //实现view bound一样的效果
  def choose(first:T,second:T)(implicit f:T=>Ordered[T]):T={
    if(first>second) first else second

  }

  def select(first:T,second:T)(implicit o:Ordering[T]):T={
    if(o.gt(first,second)) first else second
  }

}


object Miss{
  def main(args: Array[String]): Unit = {
    import  MyPreDef._
    //val m=new Miss[Girl]
    //m.choose(new Girl(""...),new Girl(""...))
  }

}
