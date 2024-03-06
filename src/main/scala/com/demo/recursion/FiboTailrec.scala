package com.demo.recursion

object FiboTailrec extends App {

  //fibonacci series using tail recursion
//0,1,1,2,3,5,8 'hfuyjfy "+ INT
//  val num =5
//  val str = "ravi"
//  println(s"my name is $str and my age is $num")
//
  def fib(n:Int):Int= {
    def fibHelper(n: Int, second: Int, third: Int):Int= {
      n match {
        case 0 =>0
        case 1 => second
        case _ => print(s"$second,");fibHelper(n - 1, third, second+third)//4,1,1//3,1,2//2,2,3//1,3,5//
      }
    }
    fibHelper(n, 0, 1)
  }
  println(fib(8))

//  def fibonacci(n: Int): List[Int] =
//    n match {
//    case 0 => List(0)  // Base case: Fibonacci(0) = 0
//    case 1 => List(0, 1)  // Base case: Fibonacci(1) = 0, 1
//    case _ => {
//      val fibSeq = fibonacci(n - 1)  // Recursive call to get the sequence for n-1
//      fibSeq match {
//        case head :: tail => fibSeq :+ (init.last + last)  // Append the sum of the last two elements
//        case _ => fibSeq  // Handle unexpected cases
//      }
//    }
//  }
//
//  // Generate the Fibonacci sequence up to 8 elements
//  val result = fibonacci(8)
//  println(result)


  def fibo(n: Int): List[Int] = {
    def fibHelper(n: Int, a: Int = 0, b: Int = 1): List[Int] = n match {
      case 0 => List()
      case 1 => List(a)
      case _ => a::fibHelper(n - 1, b, a + b)
    }
    fibHelper(n)
  }
    println(fibo(8))


  //5,0,1 :::: 0::4,1,1 :::: 1::3,1,2 :::: 1::2,2,3 :::: 2::1,3,5


//  def fact(n:Int):Int={
//     def factHelper(n:Int,acc:Int):Int= {
//       if (n=1) {
//         acc
//       } else {
//         factHelper(n - 1, n * acc) //4,5 ::3,5*4 :: 2,5*4*3
//       }
//     }
//    factHelper(n,1)
//  }
//  println(fact(8))

}


