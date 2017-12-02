package com.rpc

/**
  * Created by zk on 2017/12/2.
  * 作用: com.rpc.
  * 消息特质
  * 所有消息都实现这个特质
  * 特质里面什么都没有,可以不写{}
  */
trait RemoteMsg extends Serializable


//case class 的好处:  既可以模式匹配,还可以不用new

//其他的消息
//注册消息
case class RegisterMsg(account:String,password:String) extends  RemoteMsg

//心跳消息
case class HeartBeatMsg(clientId:String,content:String) extends  RemoteMsg

//结果消息.
//比定义字符串好,这是封装,不用解析,直接.获取
case class ResultMsg(result:String) extends  RemoteMsg