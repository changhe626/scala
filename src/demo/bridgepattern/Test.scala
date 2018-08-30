package bridgepattern

/**
  * Created by zk on 2018/1/23.
  * 作用: bridgepattern.
  */
object Test extends  App {

  new SharpA(new Red()).draw()
  new SharpB(new Yellow()).draw()
  new SharpB(new Blue).draw()

}
