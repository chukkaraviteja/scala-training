package com.demo

object FiboTailrec extends App {

  //fibonacci series using tail recursion

  def fib(n:Int):Int= {
    def fibHelper(n: Int, second: Int, third: Int): Int = {
      n match {
        case 0 => 0
        case 1 => second
        case _ => fibHelper(n - 1, third, second+third)//4,1,1//3,1,2
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
        palin(n / 10, (acc * 10) + (n % 10))
      }
    }
    palin(n,0)
  }
  var n=121
  var acc1=palindrome(n)
  if(acc1==n){
    println(s"yes num $acc1 is palindrome")
  }else{
    println(s"$acc1 is not a palindrome")
  }
}
