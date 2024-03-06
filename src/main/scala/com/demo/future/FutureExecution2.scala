package com.demo.future

object FutureExecution2 extends App {
  import scala.concurrent.{Future,Await}
  import scala.concurrent.ExecutionContext.Implicits.global
  import scala.concurrent.duration._

  val future = Future(1+2)
  println(future)

  val a1= Future{
    Thread.sleep(1000)
    20
  }
  val a2 = a1.map(_*5)

 println( a1.isCompleted)
 println( a1.value)
  println(a2.isCompleted)
 println( a2.value)

  Thread.sleep(5000)

  println( a1.isCompleted)
  println( a1.value)
  println(a2.isCompleted)
  println( a2.value)

  val futureResult: Future[Int] = Future {
    Thread.sleep(4000)
    42
  }

  // Wait for the future to complete, without retrieving its result
  Await.result(futureResult, 5.seconds) // Wait for at most 5 seconds

  println("Future is completed")


}
