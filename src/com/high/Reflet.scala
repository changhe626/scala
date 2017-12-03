package com.high

/**
  * Created by zk on 2017/12/3.
  * 作用: com.high.
  * 反射,反射函数
  * 这里都有问题
  */
class Reflet {



}

object Reflet{


  //反射class
  def functor[R](className:String,methodName:String)={
    val m=universe.runtimeMirror(getClass.getClassLoader)
    val clazz=Class.forName(className)
    val symbol=m.classSymbol(clazz)     //符号

    val method=symbol.typeSignature     //特征标签
      .members
      .filter(x =>x.isMethod && x.name.toString==methodName)
      .head
      .asMethod

    val call=m.reflect(clazz.newInstance()).reflectMethod(method)

    //andThen  先之后后面的,在放到前面执行
    (call.apply_) andThen (_.asInstanceOf[R])

  }


  //反射object
  def _functor[R](className:String,methodName:String)={
    val m=universe.runtimeMirror(getClass.getClassLoader)
    val clazz=Class.forName(className)
    val symbol=m.moduleSymbol(clazz)

    val method=symbol.typeSignature     //特征标签
      .members
      .filter(x =>x.isMethod && x.name.toString==methodName)
      .head
      .asMethod

    val call=m.reflect(m.reflectModule(symbol).newInstance()).reflectMethod(method)

    //andThen  先之后后面的,在放到前面执行
    (call.apply_) andThen (_.asInstanceOf[R])
  }




}
