package org.yixiugg.hello

import scala.io.Source

object Test {

  def main(args: Array[String]) {
//    printArgs(args)
      Source.fromFile("/home/yixiugg/dev/db/test")("utf-8").getLines.toList.foreach(
          (s:String)=>{
            var arr = s.split(" ")
            val data = new Data(arr(0),arr(0))
            println(data.toS())
            }
          )
  }
  
  def formatArgs(args:Array[String])=args.mkString("\n")
  
  def printArgs(args:Array[String]):Unit={
    println(formatArgs(args))
//    args.foreach(print)
  }
}