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

