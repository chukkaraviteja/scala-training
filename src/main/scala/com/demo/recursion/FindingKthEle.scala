package com.demo.recursion

object FindingKthEle extends App {

//  def findKthEle(list:List[Int],k:Int):Int={
//    list match {
//      case Nil => 0
//      case head :: _ if(head==k)=> list(k)
//      case _ ::tail => findKthEle(tail,k)
//    }
//  }
//  val list=List(2,4,6,7,8,9,1)
//  println(findKthEle(list,1))

def kEle(list: List[Int], k: Int): Boolean = {
  list match {
    case Nil => false   // list is empty => false
    case head :: _ if (k == head) => true  //=>  I found my element, I dont care about other elements
    case _ :: tail => kEle(tail, k) //=> checking in the remaining list
    case _ => false  //  false
  }
}


}
