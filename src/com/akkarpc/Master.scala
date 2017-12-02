package com.akkarpc

import akka.actor.{Actor, Props}

/**
  * Created by zk on 2017/12/2.
  * 作用: com.akkarpc.
  */
class Master extends Actor{
  //接受要处理的消息,偏函数
  //这是他的生命周期方法
  override def receive:Receive = {
    case "Register" =>{
      println("a msg from worker")
      //给消息的发送者返回消息,sender() 是一个方法,拿到消息发送者的引用
      sender ! "response"
    }
    case "HeartBeat"=>{}
    case "CheckTimeOut"=>{println("internal msg check")}
  }
}

object Master{
  def main(args: Array[String]): Unit = {
    val host="localhost"
    val port=8080
    val configStr=s"""
      |akka.actor.provider="akka.remote.RemoteActorRefProvider"
      |akka.remote.netty.tcp.hostname="${host}"
      |akka.remote.netty.tcp.port="${port}"
      """.stripMargin
    val config=ConfigFaactory.parseString(configStr)
    //创建ActorSystem(单例)
    val actorSystem=actorSystem("MasterActorSystem",config)
    //通过ActorSystem创建Actor
    val mastActor=actorSystem.actorOf(Props[Master],"MAsterA")
    mastActor!"checkTimeOut"    // ! 表示发异步消息

  }

}
