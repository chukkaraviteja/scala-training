package com.demo.future

object Recover extends App {

  import scala.concurrent.Future
  import scala.concurrent.ExecutionContext.Implicits.global
  import scala.util.{Success, Failure}

  // Simulated asynchronous operation that may fail
  val future: Future[Int] = Future {
    // Simulate an operation that may throw an exception
    if (scala.util.Random.nextBoolean()) {
      throw new RuntimeException("Operation failed!")
    } else {
      42
    }
  }

  // Handle the future result, recovering from failure
  val recoveredFuture: Future[Int] = future.recover {
    case _: RuntimeException => 0// Recover with a default value in case of RuntimeException
  }
  
  recoveredFuture.onComplete {
    case Success(result) => println(s"Future result: $result") // Handle successful result
    case Failure(exception) => println(s"Future failed with exception: $exception") // Handle failure
  }
Thread.sleep(5000)

}
