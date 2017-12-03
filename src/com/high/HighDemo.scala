package com.high

import com.akkarpc.Worker
import com.sun.crypto.provider.AESCipher
import com.sun.crypto.provider.AESCipher.AES128_CBC_NoPadding

import scala.runtime.RichInt

/**
  * Created by zk on 2017/12/2.
  * 作用: com.high.
  */
class HighDemo {

  val arr=Array(1,3,5,6)
  val tmp1=arr.map(x=>x*2)


  //柯里化,将原来接受两个参数的方法变成接受一个新参数的方法
  def m1(x:Int,y:Int)=x*y

  def m2(x:Int)(y:Int)=x*y

  arr.fold(0)(_+_)  //柯里化方法

  m2(3)(4)  //12

  m2(3)   //报错

  val res1=m2(3) _   //第一值是3,只需要传递第二个值就行了

  res1(5)   //15

  //给他一个默认值,不传就用默认值,否则用传递的值


  def m3(x:Int)(implicit y:Int=10):Int=x*y   //默认值
  m3(4)
  m3(3)(6)


  //主要在隐士转换中使用...
















}

object HighDemo{
  //隐士值
  def main(args: Array[String]): Unit = {
    val r=m2(5)(9)
    println(r)


    val r2=m2(3)_
    println(r2(4))



  }


  def m2(x:Int)(y:Int):Int=x+y

  //有了默认值,可以传,可以不传了
  def m3(x:Int)(implicit y:Int=100):Int=x+y


  implicit  val abc:Int=20
  //只要类型一样,优先使用隐士值,不使用100,使用20
  //一个object里面
  //如果没有这个,就会使用上面的100了


  //在class中无法使用直接import引用其他类的这个隐士值
  //这样导入隐士值,才可以用
  val c=new Worker
  import c._

  //为什么要new 类,因为是class中内容,到能够导入


  //如果是object 中的 隐士值
  //可以直接import Context._   导入,就能够使用隐士值了

  //如果object里面有相同类型的多个,报错了
  //如果多个隐士值,不能使用类型一样的.首先找的是类型一样的隐士值


  println(m2(10))      // 30   相当于10 和 99 相加了
  println(m2(10)(30))  //40




  1 to 10
  //到底哪里来的?  隐士转换  是一个方法
  /**
    * 为什么可以调用?
    * 原来Int上没这个方法,典型的隐士转换,在RichInt里的
    * 装饰模式,包一层
    * 把Int包装成RichInt就能调用to方法了
    * 是在PreDef  包装的
    *
    * :implicits -v  查看已经导入的,默认导入了
    *
    */

  val i: RichInt = new RichInt(4)
  i.to(10)










}
