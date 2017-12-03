package com.high

/**
  * Created by zk on 2017/12/3.
  * 作用: com.high.
  */
class PairKeli[T] {


  //  p.bigger(1,10)  (implicit  把Int转换成Integer的函数)

 def bigger(first:T,second:T)(implicit f:Int=>Integer): T ={




 }
  //1.使用泛型的方式,隐士转换
//  def bigger(first:T,second:T)(implicit f:T=>Comparable[T]):T={
//  if(first.compareTo(second)>0) first else second
//  }



}

object PairKeli{
  def main(args: Array[String]): Unit = {
    //1.使用
//    val p=new PairKeli[Int]
//    println(p.bigger(10,20))




  }

}
