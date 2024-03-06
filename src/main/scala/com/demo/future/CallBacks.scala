package com.demo.future

object CallBacks extends App{
  import scala.concurrent.Future
  import scala.concurrent.ExecutionContext.Implicits.global

  def asyncComputation(value: Int): Future[Int] = Future {
    Thread.sleep(1000)
    value * 2
  }

  val future1: Future[Int] = asyncComputation(10)
  val future2: Future[Int] = asyncComputation(20)

  // Callback on future1 that depends on its result
  future1.foreach { result1 =>
    // This callback will be executed asynchronously when future1 completes
    // It depends on the result of future1
    println("Future 1 completed with result: " + result1)

    // Now we can use the result of future1 to perform another asynchronous computation
    val future3: Future[Int] = asyncComputation(result1 * 3)

    // Callback on future3
    future3.foreach { result3 =>
      // This callback will also be executed asynchronously when future3 completes
      // It depends on the result of future3
      println("Future 3 completed with result: " + result3)
    }
  }

  // Callback on future2
  future2.foreach { result2 =>
    // This callback will be executed asynchronously when future2 completes
    // It does not depend on the result of future1
    println("Future 2 completed with result: " + result2)
  }

  // Continue with other operations...


}
