package com.demo

object FiboTailrec extends App {

  //fibonacci series using tail recursion

  def fib(n:Int):Int= {
    def fibHelper(n: Int, a: Int, b: Int): Int = {
      n match {
        case 0 => 0
        case 1 => a
        case _ => print(s"$a,"); fibHelper(n - 1, b, a + b)
      }
    }
    fibHelper(n, 0, 1)
  }
  println(fib(10))

// palindrome number tail recursion

  def palindrome(n:Int) {
    def palin(n: Int, acc: Int): Int = {
      if (n == 0) {
        acc
      }
      else {
        var acc: Int = (acc * 10) + (n % 10)
        palin(n / 10, acc)
      }
    }
    palin(n,0)
  }
  var n=121
  var acc1=palindrome(n)
  if(acc1==n){
    println(s"yes num $acc1 it is palindrome")
  }else{
    println(s"$acc1 is no a palindrome")
  }
}
