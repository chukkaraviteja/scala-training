package com.demo

object Fibonacci extends App {

  def fibonacci(n:Int):Int= {
    var a1: Int = 0
    var a2: Int = 1
    if (n < 1) {
      n
    } else {
      for (i <- 2 to n) {
        var sum: Int = a1 + a2
        a1 = a2
        a2 = sum
      }
      a2
    }
  }
 val n:Int=12
  println(fibonacci(n))

  def tables(n: Int) {

    for (i <- 1 to 10) {

      println( s"$n*$i=${n*i}") //3*1 3*2 3*3

    }
  }
  tables(173537)

}
