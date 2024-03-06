package com.demo.future

import com.sun.net.httpserver.Authenticator.{Failure, Success}

import scala.concurrent.{Await, Promise}

object FutureExecution extends App {
  import scala.concurrent.Future
  import scala.concurrent.ExecutionContext.Implicits.global
  import scala.util.{Success,Failure}

  val futureResult:Future[Int]= Future {

    Thread.sleep(1000)
    42
  }

  val res1=futureResult.onComplete {
    case Success(result) =>println( result)
    case Failure(exception) => println(exception)  }


//  Await.result(futureResult,1000)


  // Define two futures representing asynchronous computations
  val future1: Future[Int] = Future { 10 }
  val future2: Future[Int] = Future { 20 }

  // Chain the futures using flatMap and map

  val combinedFuture: Future[Int] = future1.flatMap { result1 =>
    future2.map { result2 =>
      result1 + result2
    }

  }
  // this is the result of combined future
  combinedFuture.foreach { result =>
    println(s"Result of combining future1 and future2: $result")
  }
  println(combinedFuture)


  // Define a future representing an asynchronous computation that will fail with an exception
  val futureResult1: Future[Int] = Future {
    throw new RuntimeException("Error: Future computation failed")
  }

  // Attach a callback to handle the failure of the future
  futureResult1.onComplete {
    case scala.util.Failure(exception) => println(s"Future failed with exception: $exception")
    case _ => println("no exceptions")
  }


}
