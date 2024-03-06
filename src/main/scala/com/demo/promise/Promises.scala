package com.demo.promise

import com.demo.promise.Promises.list


object Promises extends App {


  import scala.concurrent.{Future, Promise}
  import scala.util.{Success,Failure}
  import scala.concurrent.ExecutionContext.Implicits.global

  // Define a function representing an asynchronous task
  def performTask(taskId: Int): Future[String] = {
    val promise = Promise[String]()

    Future {
      try {
        Thread.sleep(1000) // Simulate task execution time
        if (taskId == 1) {
          throw new RuntimeException("Task 1 failed!") // task failure
        }
        promise.success(s"Task $taskId completed successfully")
      } catch {
        case ex: Exception => promise.failure(ex) // Fail the promise with the exception
      }
    }
    promise.future
  }

   val task1Promise = performTask(1)
   val task2Promise = performTask(2)


  task1Promise.onComplete {
    case Success(result) => println(result)
    case Failure(excep) => println(s"Task 1 failed with exception: $excep")
  }

   task2Promise.onComplete {
     case Success(result) => println(result)
     case Failure(excep) => println(s"Task 1 failed with exception: $excep")
   }
  Thread.sleep(9000)


  val promise = Promise[Int]()
  val future = promise.future

  val result: Either[String, Int] = Left("An error occurred")

  result match {
    case Left(error) => promise.failure(new RuntimeException(error))
    case Right(value) => promise.success(value)
  }

  future.onComplete {
    case scala.util.Success(value) => println(s"Result: $value")
    case scala.util.Failure(error) => println(s"Error: ${error.getMessage}")
  }

Thread.sleep(10000)

  val list = List(1,1,1,2,2,2,4,4,5,5,6,6,7)


}
