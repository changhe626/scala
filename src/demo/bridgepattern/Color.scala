package bridgepattern

/**
  * Created by zk on 2018/1/23.
  * 作用: bridgepattern.
  * 因为这里使用了关键字type
  * 不适用关键字就可以不用``  这个了
  */
trait Color {
  //def drawSharp(`type`:String)
  def drawSharp(myType:String)

}
