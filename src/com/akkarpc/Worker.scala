package com.akkarpc

import akka.actor.{Actor, ActorSystem, Props}

/**
  * Created by zk on 2017/12/2.
  * 作用: com.akkarpc.
  */
class Worker  extends  Actor{

 //重写方法,在Actor构造方法之后,在执行receive之前执行的,执行一次
  override def preStart(): Unit = {
    //和master建立连接,并通信,拿到了一个master的代理对象
    val master=context.actorSelection("akka.tcp://MasterActorSystem@localhost:8080/user/MasterA")
    //worker向master发消息
    master!"Register"

  }

  //会被执行很多次,只要有消息
  override def receive :Receive= {
    case "response" => { println("a response from master") }
  }
}

object Worker{

  def main(args: Array[String]): Unit = {
    val host="localhost"
    val configStr=s"""
                     |akka.actor.provider="akka.remote.RemoteActorRefProvider"
                     |akka.remote.netty.tcp.hostname="${host}"   //地址一定要有的
                       //客户端可以不要端口号,这里的端口号不能和服务端相同
      """.stripMargin
    val config=ConfigFactory.parseString(configStr)
    //创建actorSystem
    val actorSystem=ActorSystem("workActorSystem",config)
    //创建Actor
    actorSystem.actorOf(Props[Worker],"workerB")
  }

}