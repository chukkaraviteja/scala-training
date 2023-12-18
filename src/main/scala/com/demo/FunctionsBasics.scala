package com.demo

object FunctionsBasics extends App {

  //anonymous function

  val mul = (a:Int,b:Int)=> a*b

println(s" multiplication of  two numbers is: ${mul(2,3)}")

  //closure function

  val num1:Int= 3
  def multi(a:Int):Int={
    val b:Int=5;
    val multiplication = num1*b*a
    multiplication
  }
  println(s"output of closure function is: ${multi(5)}")

  //nested function

  def multi(a: Int, b: Int): Double = {
    def nestedFun(c: Int): Int = {
      val mul = a * b * c;
      mul
    }

    nestedFun(5) * 5.0;
  }
  println(s"the output is ${multi(2,3)}")

  //pure functions

  val a:Int= 5
  val b:Int=3

  def pure(a: Int, b: Double):Double = {
   a*b
  }
 println(pure(3,5.9854454353252))


}
