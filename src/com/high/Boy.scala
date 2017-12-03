package com.high

/**
  * Created by zk on 2017/12/3.
  * 作用: com.high.
  * 泛型
  */
class Boy (val name:String,val age:Int,val faceValue:Int) extends Comparable[Boy]{
  override def compareTo(o: Boy):Int = {
    if(this.faceValue==o.faceValue) {
      this.age-o.age
    }else{
      -(this.faceValue-o.faceValue)
    }
  }

  override def toString = s"${name}, ${age}, ${faceValue}"
}


object Boy{
  def main(args: Array[String]): Unit = {
    val arr=Array[Boy](new Boy("zhaojun",18,100),new Boy("zhaojun2",19,101),new Boy("zhaojun3",20,201))

    val sortedArr=arr.sorted

    //运行报错,没有传递函数进去.实现了Compareable接口
    // println(sortedArr(0).name)

    println(sortedArr.toBuffer)


    /**
      * java的泛型用<>
      * scala的泛型用[]
      *
      * [T <: Comparable]    上界upper bound
      * 可以传上界及其以下  T super Comparable
      * [T :> Comparable]     下界lower bound
      * 可以传下界及其以上  T extends Comparable
      * [T : Comparable]      上下文界定 context bound
      *
      * [T % Comparable]      视图界定view bound
      *
      * [+T]                  协变
      *
      * [-T]                  逆变
      *
      */

  }


}
