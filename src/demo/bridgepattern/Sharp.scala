package bridgepattern

/**
  * Created by zk on 2018/1/23.
  * 作用: bridgepattern.
  */
abstract class Sharp(color: Color) {
  def draw()

}

class SharpA(color: Color) extends Sharp(color){
  override def draw(): Unit = color.drawSharp("sharpA")
}

class SharpB(color: Color) extends  Sharp(color){
  override def draw(): Unit = color.drawSharp("sharpB")
}
