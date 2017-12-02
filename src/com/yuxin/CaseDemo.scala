package com.yuxin

import com.zhaojun.{AppDemo};
/**
  * Created by zk on 2017/12/2.
  * 作用: com.yuxin.
  */
class CaseDemo{

  //模式匹配
  def match1(name:String):Int=name match{
    case "zhaojun" =>1
    case "yuxin"=>{
      println("yuxin")
      2
    }
    case _ =>0
  }

  //偏函数,没有上面的match,功能上一样的
  //要带上PartailFunction, 第一个是参数,第二个是返回值
  def match2:PartialFunction[String,Int]={
    case "zk" =>1
    case _=>2
  }
}


object CaseDemo {

  val tmp=CaseDemo

  //模式匹配的 类
  tmp match {
    case CaseDemo =>println("ok")
    case _ =>println("others")
  }

}
