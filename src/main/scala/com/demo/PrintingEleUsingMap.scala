package com.demo

object PrintingEleUsingMap extends App{

  //using map
   val list = List(2,3,4,5,6,7,8,9)
  list.map(el=>print(s"$el,"))
  println()

  //using for loop
  for(el<-list){
    print(s"$el,")
  }
}
