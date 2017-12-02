package com.rpc

import java.io.{ObjectInputStream, ObjectOutputStream}
import java.net.Socket

/**
  * Created by zk on 2017/12/2.
  * 作用: com.rpc.
  * 客户端类
  */
class PRCClient {

  def conncet(host:String,port:Int):Socket={

    null
  }

}

object RPCClient{

  def main(args: Array[String]): Unit = {
    val client=new PRCClient
    val socket: Socket = client.conncet("127.0.0.1",8080)
    //通信(获取输出流)
    val oos: ObjectOutputStream = new ObjectOutputStream(socket.getOutputStream)
    oos.writeObject(RegisterMsg("tom","123"))
    oos.flush()

    //获取输入流的响应
    val ois: ObjectInputStream = new ObjectInputStream(socket.getInputStream)
    val response: AnyRef = ois.readObject()
    //可以转,也可以不用类型的转换
    response match {
      case ResultMsg(result) =>  { println(result+"message from server") }
    }

    oos.close()
    socket.close()
  }

}
