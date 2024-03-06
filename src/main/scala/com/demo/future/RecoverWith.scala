package com.demo.future

object RecoverWith extends App {

  import scala.concurrent.Future
  import scala.concurrent.ExecutionContext.Implicits.global
  import scala.util.{Success, Failure}

  val future: Future[Int] = Future {
    // operation that may throw an exception
    if (scala.util.Random.nextBoolean()) {
      throw new RuntimeException("Operation failed!")
    } else {
      42
    }
  }
  // Define a fallback future to be executed in case of failure
  val fallbackFuture: Future[Int] = Future {
    println("Fallback future executed")
    0
  }
  // Handle the future result, recovering with a fallback future in case of failure
  val recoveredFuture: Future[Int] = future.recoverWith {
    case _: RuntimeException => fallbackFuture // Recover with a fallback future in case of RuntimeException
  }
  // Attach a callback to handle the result
  recoveredFuture.onComplete {
    case Success(result) => println(s"Future result: $result") // Handle successful result
    case Failure(exception) => println(s"Future failed with exception: $exception") // Handle failure
  }


}
