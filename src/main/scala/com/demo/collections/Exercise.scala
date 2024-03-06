package com.demo.collections

object Exercise extends App {
  // find the sum of the numbers in the below list using foldleft
  val stringifiedInts = List("1", "2", "3", "4", "5")
  val result = stringifiedInts.foldLeft("")((acc, ele) => s"${acc + ele} ")
  println(result)
  val result2 = stringifiedInts.foldLeft(0)((acc, ele) => acc.toInt + ele.toInt)
  println(result2)

  //separate the even numbers from the below list and double them
  // val list = List(1, 2, 3, 6, 4, 8, 5)
  //expected data = List(4,12,8,16)

  val list = List(1, 2, 3, 6, 4, 8, 5)
  //val res1= (x:Int)=>x*2
  val res = list.filter(_ % 2 == 0).map(_ * 2)
  // it returns list from filter and then performes operation on map

  list.fold(0)((x,y)=>{println(s"[$x $y]");x+y})
  list.foldLeft(0)((x,y)=>{println(s"[$x $y]");x+y})


}

