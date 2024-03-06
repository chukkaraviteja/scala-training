package com.demo.recursion

import scala.::

object AddingListEle extends App {

  def addingEle(list:List[Int]):Int={

    def addition(list:List[Int],acc:Int):Int={
      list match {
        case Nil=> acc
        case head::tail => addition(tail,acc+head)
      }
    }
    addition(list,0)
  }

  val list=List(2,3,4)
  println(addingEle(list))

}
