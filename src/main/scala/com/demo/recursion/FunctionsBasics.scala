package com.demo.recursion

object FunctionsBasics extends App {

  //anonymous function

  val mul = (a:Int,b:Int)=> a*b

println(s" multiplication of  two numbers is: ${mul(2,3)}")

  //closure function

  val num1:Int= 3
  def multi(a:Int):Int={
    val b:Int=5
    val multiplication = num1*b*a
    multiplication
  }
 println(multi(5))

  //nested function

  def multiply(a: Int, b: Int): Double = {
    def nestedFun(c: Int): Int = {
      val mul = a * b * c
      mul
    }

    nestedFun(5) * 5.0
  }
 println(multiply(2,3))

  //pure functions

  val a:Int= 5
  val b:Int=3

  def pure(a: Int, b: Double):Double = {
   a*b
  }
 println(pure(3,5.9854454353252))



  def fibonacci(n:Int):Unit= {
    var a1: Int = 0
    var a2: Int = 1
    if (n < 1) {
      n
    } else {
      for (i <- 2 to n) {
        var sum: Int = a1 + a2
        a1 = a2
        a2 = sum
        print(s"$sum,")
      }
    }
  }

    println(fibonacci(12))

    def tables(n: Int) {


      for (i <- 1 to 10) {

        println( s"$n*$i=${n*i}") //3*1 3*2 3*3


      }
    }
      tables(173537)

  }


