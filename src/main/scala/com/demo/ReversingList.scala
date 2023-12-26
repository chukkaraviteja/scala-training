package com.demo

object ReversingList extends App {


  def reversingList(list:List[Int]):List[Int]= {
    var l = list
    var list1: List[Int] = List()

    while (l.length != 0) {
      list1 = l.head :: list1 //prepending head of a to b
      l = l.tail //removing head from list
    }
    list1
  }
  println(reversingList(List(3,5,7,8,9,4,5,6)))

  // using tailrecusrsion and pattern matching

  def reverse(list:List[Int]):List[Int]={
    def rev(acc:List[Int],list:List[Int]):List[Int]={
      list match {
        case Nil => acc
        case head::tail => rev(head::acc,tail)
      }
    }
    rev(Nil,list)
  }
  print(reverse(List(2,4,7,9,0)))
}
