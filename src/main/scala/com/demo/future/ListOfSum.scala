package com.demo.future

object ListOfSum extends App {
  import scala.concurrent.{Await, Future}
  import scala.concurrent.ExecutionContext.Implicits.global
  import scala.concurrent.duration._

    def futureSum(futures: List[Future[Int]]): Future[Int] = {
      Future.sequence(futures).map(_.sum)
    }
    val futuresList: List[Future[Int]] = List(Future(1), Future(2), Future(2))
    val sumFuture: Future[Int] = futureSum(futuresList)
    val result: Int = Await.result(sumFuture, 3.second)
    println(s"Sum of Futures: $result")
}
import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

object FutureSumExample extends App {

  // List of Future instances representing asynchronous computations
  val futures: List[Future[Int]] = List(Future(1), Future(2), Future(3))

  // Step 1: Use Future.sequence to combine the list of Future[Int] into a Future[List[Int]]
  val combinedFuture: Future[List[Int]] = Future.sequence(futures)

  // Step 2: Use map to sum the values inside the List[Int] when the Future completes
  val sumFuture: Future[Int] = combinedFuture.map(_.sum)

  // Step 3: Await the result (for demonstration purposes, avoid blocking in a real application)
  val result: Int = Await.result(sumFuture, 5.seconds)

  // Step 4: Print the result
  println(s"Sum of Futures: $result")
}


