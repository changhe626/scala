package com.zhaojun

/**
  * Created by zk on 2017/11/30.
  * 作用: com.zhaojun.
  */
//就在这里定义主构造器
class ZhaoJun (age:Int,name:String){
  println("主构造器执行了")

  //val sex:String=null

  var  sex:String=_  //构造的时候进行赋值,只能是var类型的

  def this(age:Int,name:String,sex:String){
    this(age,name)   //第一行是主构造器
    this.sex=sex
  }

  def getAge():Int=age

}

object ZhaoJun{
  val constant="i love zhaojun"


  def main(args: Array[String]): Unit = {
    val z=new ZhaoJun(18,"zhaojun")
    println(z)
    println(z.getAge())

    val k=new ZhaoJun(18,"zk","nan")
    println(k.sex)
  }

}
