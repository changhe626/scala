package bridgepattern

/**
  * Created by zk on 2018/1/23.
  * 作用: bridgepattern.
  */
class Red  extends  Color {

  override def drawSharp(myType: String): Unit = println(s"Red ${myType} is  already drawn ")
}

class Blue extends Color{
  override def drawSharp(myType: String): Unit = println(s"Blue ${myType} is drawn,thank you ")
}

class Yellow extends  Color{
  override def drawSharp(myType: String): Unit = println(s"Yellow   ${myType} is already drawn too,")
}
