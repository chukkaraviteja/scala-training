package com.demo.oops

class FindingSumOfIndex {

 def findIndicesWithSum(numbers: List[Int], k: Int): Option[(Int, Int)] = {
    numbers.indices.foreach { i =>
      (i + 1 until numbers.length).foreach { j =>
        if (numbers(i) + numbers(j) == k) {
          return Some(i, j)
        }
      }
    }
    None
  }
  def main(args: Array[String]): Unit = {
    val numbers = List(2, 7, 11, 15)
    val k = 9
    findIndicesWithSum(numbers, k) match {
      case Some((index1, index2)) =>
        println(s"Indices are: $index1, $index2")
      case None =>
        println("No such pair found.")
    }
  }

}
