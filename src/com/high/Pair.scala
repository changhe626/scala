package com.high

/**
  * Created by zk on 2017/12/3.
  * 作用: com.high.
  * 泛型的具体
  */
class Pair[T <: Comparable[T]] {

  def bigger(first:T,second:T):T={
    //因为>  是个方法,所以报错
    //if(first > second) first  else second

    if(first.compareTo(second) >0) first  else second

  }

}


object Pair{
  def main(args: Array[String]): Unit = {
    val p=new Pair[Boy]
    val tmp=p.bigger(new Boy("zhaojun",18,100),new Boy("zhaojun2",19,101))

    println(tmp.name)





    //2.
    val i=new Pair[Int]
    println( i.bigger(10,100) )   //报错
    //报上界改成<%,就不报错了
    //在PreDef中有Int到Integer的转换的方法

    val i2=new Pair[Integer]
    i2.bigger(10,100)   //100 , 实现了Comparable接口



  }

}
