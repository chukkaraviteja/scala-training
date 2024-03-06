package com.demo.recursion

import scala.annotation.tailrec

object Review extends App {

//  var num:Int=5 // mutable
//  val num1:Int=5 //immutable
//
//  num= 6
//  print(num)
// val name:String="teja"
//  val num2:Long= 1234523L
//  val num3:Double= 2.0f
//  val num4:Float=2
//
//  def number(x:Int,y:Int):Int= x + y
//  val sub= (x:Int,y:Int)=> x-y
//
//  def curyAdd(x:Int)(y:Int):Int=x+y
//  val res=curyAdd(2)(3)
//  val res2:Int=>Int= curyAdd(2)(_)
//  res2(24)

//  def fibonacci(n:Int=5):Int={
//    if(n<1) n
//    else fibonacci(n-1)+fibonacci(n-2)
//
//    }
//  print(fibonacci())
//
//  // git init , git status
//
//
//  def numbers(x:Int,y:Int=5,z:Int=2):Int=x+y+z
// print(numbers(5,y=12))
// class Add(a:Int,b:Int){

//}
//  object Add{
//  def apply(x:Int,y:Int)= new Add(x,y)
//  }
//    val addition = Add(2,3)
//
//}

//case class Animal(name:String)
//
//val animal = Animal.apply("dog")

val multiply:PartialFunction[(Int,Int,Int),Int]={
  case (a,b,c)=> a*b*c
}

  multiply.isDefinedAt(2,3,4)

  
}