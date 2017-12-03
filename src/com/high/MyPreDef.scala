package com.high

import java.io.File

/**
  * Created by zk on 2017/12/3.
  * 作用: com.high.
  * 隐士转换,把File隐士转换为RichFile
  */
object MyPreDef {

  //要有File ->RichFile的一个方法
  //用implicit修饰

 implicit def file2RichFile(file:File):RichFile={
    new RichFile(file)
  }

}
