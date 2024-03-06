package com.demo.future


object ImpCode extends App {

//    val recoveredFuture: Future[Int] = future.recover {
//      case _: RuntimeException => -1 // Handle specific failure case
//    }
//
//    val recoveredFuture2: Future[Int] = future.recoverWith {
//      case _: RuntimeException => Future.successful(-1) // Handle specific failure case
//      with a new future
//    }

  import scala.concurrent.Future
  import scala.concurrent.ExecutionContext.Implicits.global
  import  scala.util.{Random}

  val future: Future[Int] = Future {
    if (Random.nextBoolean()) throw new RuntimeException("Oops!")
    else 42
  }

  val recoveredFuture: Future[Int] = future.recover {
    case _: RuntimeException => -1 // Fallback value
  }


}
