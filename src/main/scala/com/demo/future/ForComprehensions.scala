package com.demo.future

//import com.demo.future.ForComprehensions.future1

object ForComprehensions extends App {
  import scala.concurrent.Future
  import scala.concurrent.ExecutionContext.Implicits.global
  import scala.util.{Success,Failure}

  // synchronous for list
  val numbers = List(1, 2, 3, 4, 5)
  val squaredNumbers: List[Int] = for {
    num <- numbers
  } yield num * num
  println(squaredNumbers)


// async operation
//  val future1:Future[Int]= Future{14}
//  val future2:Future[Int]= Future{20}

  val res=for {
    result1 <- Future(14)
    result2 <- Future(12)
  } yield result1+ result2

res.foreach{reslt=>
  println(s"the result is : $reslt")
}


  //computation2 depends on the result of computation1
  val computation1: Future[Int] = Future {
    Thread.sleep(3000)
    println(".......")
    42
  }
  val combinedResult: Future[Int] = for {
    result1 <- computation1
    result2 <- Future.successful(result1 * 2) // computation2 depends on result1
    // here future.successful  is a useful method when you already have a result value available
    // and want to wrap it in a Future. It's commonly used to represent synchronous computations
    // or to create Future instances with predefined result values for testing or mocking purposes.
  } yield result1 + result2

  combinedResult.foreach(res=> println(s"combined result is: $res"))


  // Asynchronous computations
  val future3: Future[Int] = Future {
    Thread.sleep(1000)
    10
  }
  val future4: Future[Int] = Future {
    Thread.sleep(500)
    20/0
  }
  val combinedResult1: Future[Int] = for {
    result1 <- future3 // Asynchronously wait for the result of future3
    result2 <- future4 // Asynchronously wait for the result of future4
  } yield result1 + result2 // Combine the results when both futures complete
  // Handling the combined result asynchronously
  combinedResult1.onComplete {
    case Success(result) => println(s"Combination Result: $result")
    case Failure(exception) => println(s"Error occurred: $exception")
  }
  println("Other computations are running...")

  // Ensure the program keeps running until the asynchronous operations complete
  Thread.sleep(7000)

}
