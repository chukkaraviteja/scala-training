package com.demo.future

object ListOfFutures extends App {
  import scala.concurrent.Future
  import scala.concurrent.ExecutionContext.Implicits.global

  // Define a list of future computations
  val listOfFutures: List[Future[Int]] = List(
    Future (11 + 1 ),
    Future { 12 * 2 },
    Future { 13 - 3 }
  )
  // Handling the list of futures
  val combinedFuture: Future[List[Int]] =  Future.sequence(listOfFutures)
  // Future.sequence is Async as we use futures in it, F.seq waits for all the inputs should beCompleted
 //and each input result is collected,once all futures results are collected F.seq returns single Future
  combinedFuture.foreach { resultList =>
    println(s"Resultant List is: $resultList")
  }

  import scala.concurrent.Future
  import scala.concurrent.ExecutionContext.Implicits.global

  // Define a list of futures
//  val listOfFutures: List[Future[Int]] = List(
//    Future { 1 + 1 },
//    Future { 2 * 2 },
//    Future { 3 - 1 }
//  )

  // Use flatMap to transform each future into a new future that produces a single value
//  val combinedFuture: Future[List[Int]] = listOfFutures.foldLeft(Future.successful(List.empty[Int]))
//  { (accFuture, nextFuture) =>
//    accFuture.flatMap { accList =>
//      nextFuture.map(_ :: accList)
//    }
//  }.map(_.reverse) // Reverse the list to maintain the original order
//
//  // Handling the combined result asynchronously
//  combinedFuture.foreach { resultList =>
//    println("Result List: " + resultList.mkString(", "))
  //}





}
