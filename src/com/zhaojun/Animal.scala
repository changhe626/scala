package com.zhaojun

/**
  * Created by zk on 2017/11/30.
  * 作用: com.zhaojun.
  */
abstract  class Animal extends Fly with Eat {

  def wark(name:String)=println(name+"is warking")

  def drink(name :String);

}
