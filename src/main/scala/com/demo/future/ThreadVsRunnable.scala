package com.demo.future

object ThreadVsRunnable extends App {

//  Concurrency refers to the ability of a system to execute multiple tasks or processes concurrently.
//    In a concurrent system, multiple tasks may start, run, and complete at overlapping time intervals,
//  but they are not necessarily executed simultaneously. Concurrency is primarily
//  concerned with managing the execution of tasks in a way that appears to be simultaneous,
//  often by interleaving the execution of tasks over time.


  // Using Thread
  val thread = new Thread() {
    override def run(): Unit = {
      // Thread behavior
    }
  }
  thread.start()

  // Using Runnable
  val runnable = new Runnable {
    override def run(): Unit = {
      // Task behavior
    }
  }
  val thread1 = new Thread(runnable)
  thread1.start()

  // thread safety

  class Counter {
    private var count = 0

    def getCount: Int = synchronized {
      count
    }
    def increment(): Unit = synchronized {
      count += 1
    }
  }

  val counter = new Counter()


  // Thread 1
  new Thread(() => {
  Thread.currentThread().setName("IncrementerThread")
    println(Thread.currentThread().getName)
    counter.increment()
  }).start()

  // Thread 2
  new Thread(() => {
    Thread.currentThread().setName("Getter Thread")
    println(Thread.currentThread().getName)
    println(counter.getCount)
  }).start()

  // thread pool

  import java.util.concurrent.Executors

  val pool = Executors.newFixedThreadPool(6)

  pool.execute(() => {
    println(Thread.currentThread().getName)
    println("Task executed by thread pool")
  }
  )

  pool.execute(() => {
    println(Thread.currentThread().getName)
    println("Task executed by thread pool")
  }
  )

  pool.execute(() => {
    println(Thread.currentThread().getName)
    println("Task executed by thread pool")
  }
  )

  pool.shutdown() // Shutdown the thread pool






}
