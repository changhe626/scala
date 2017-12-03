package com.high

import java.io.File

import scala.io.Source

/**
  * Created by zk on 2017/12/3.
  * 作用: com.high.
  * 隐士转换,把File隐士转换为RichFile
  */
class RichFile(file:File) {


  def read():String={
    Source.fromFile(file).mkString
  }

}

object RichFile{
  def main(args: Array[String]): Unit = {
    //2.显示的装饰一下,装饰模式
    val con=new RichFile(new File("a.txt")).read()

    //3.隐士增强,怎么进行转换,导入,就可以了
    //也可以在上面导入,
    import  MyPreDef._
    val content=new  File("a.txt").read()


    //1.以前没有这个方法,怎么加上?
    //val content=new  File().read()

  }


}
