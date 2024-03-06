package com.demo.fop

object Mapping extends App{
  def counting[A](list: List[A]): Map[A, Int] = {
    def count(map: Map[A, Int], elem: A): Map[A, Int] = {
      map.get(elem) match {
        case Some(count) => map + (elem -> (count + 1)) // Increment count if element exists
        case None => map + (elem -> 1)                  // Add element with count 1 if it doesn't exist
      }
    }
    list.foldLeft(Map.empty[A, Int])(count) //def count(map: Map[Int, Int], num: Int): Map[Int, Int] = {
    //map + (num -> (map.getOrElse(num, 0) + 1))
  }
//    val myList = List(1, 2, 3, 1, 2, 3, 1, 23)
//    val result = counting(myList)
//    // Print the count of each element
//    result.foreach { case (elem, count) =>
//      println(s"$elem appears $count times.")



}
