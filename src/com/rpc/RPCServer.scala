package com.rpc

import java.io.{ObjectInputStream, ObjectOutputStream}
import java.net.{ServerSocket, Socket}

/**
  * Created by zk on 2017/12/2.
  * 作用: com.rpc.
  * 服务端
  *
  * RPC是长连接
  *
  * 效率太低.
  * 用netty 封装了nio
  * 或者用mina 很好用
  *
  */
class RPCServer {

 private def handlerRegister(account: String, password: String): ResultMsg = {
    println(s"已进有人来注册了, 注册的信息是${account}   ,${password}")
    ResultMsg("register success")
  }

  private def hendlerHeartbeat(id: String, content: String): ResultMsg = {
    println(s" 心跳检测${id}  , ${content} ")
    ResultMsg("i am still alive")
  }



  /**
    * 启动服务
    *
    * @param port
    */
  def bind(port:Int):Unit={
    //创建一个ServerSocket
    val ss=new ServerSocket(port)
    val clientSocket:Socket=ss.accept()
    //获取输入流(读取)
    val ois: ObjectInputStream = new ObjectInputStream(clientSocket.getInputStream)
    //获取输出流(写出)
    val oos: ObjectOutputStream = new ObjectOutputStream(clientSocket.getOutputStream)
    var flag=true
    while(flag){
      val msg: AnyRef = ois.readObject()
      val rmsg =msg.asInstanceOf

      //进行模式匹配
      val result:ResultMsg=rmsg match{
        case RegisterMsg(account,password)=>{
          handlerRegister(account,password)
        }
        case HeartBeatMsg(id,content)=>{
          hendlerHeartbeat(id,content)
        }
      }
      //将ResultMsg 发回给client
      oos.writeObject(result);
      oos.flush()

    }

  }


}

object RPCServer{
  def main(args: Array[String]): Unit = {
    val server=new RPCServer
    server.bind(8080)
  }


}
