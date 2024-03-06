package com.demo.promise

class PromiseChain extends App {
  import scala.concurrent.{Future, Promise}
  import scala.concurrent.ExecutionContext.Implicits.global

  // Create a promise
  val promise1 = Promise[Int]()
  // Define a future that will complete the promise
  val future1 = Future {
    Thread.sleep(1000)
    42
  }

  val promise2 = Promise[String]()
  future1.foreach(result => promise2.success(s"Result: $result"))

  val future2 = promise2.future

  // Print the result from the second future
  future2.foreach(println)

//  val promise2 = Promise[String]()
//
//  val future2 = for {
//    result <- future1
//  } yield {
//    promise2.success(s"Result: $result")
//    s"Result: $result"
//  }




}
