package com.demo.oops

object GenTypes extends App {
  def reverse1[A](list: List[A]): List[A] = {
    list.grouped(2).flatMap(_.reverse).toList
  }

  case class Complex(a: Double, b: Double) {
    def + (result: Complex): Complex =  Complex(a+result.a, 2+result.b)
    def - (result: Complex): Complex =  Complex(a-result.a, 2-result.b)

    override def toString: String = s" $a +${b}"
  }


  val complex1 = Complex(8.0, 3.0)
  val complex2 = Complex(6.0, 2.0)


  val sum = complex1+complex2
  val diff = complex1-complex2


  println(s"::sum ::  $sum")
  println(s"::diff ::  $diff")

  def removeDuplicates[A](list: List[A]): List[A] = {
    list match {
      case Nil => Nil // Base case: empty list, return empty list
      case head :: tail =>
        head :: removeDuplicates(tail.filter(el=>el!= head)) // Keep the head and recursively remove duplicates from the tail
    }
  }

  val myList = List(1, 2, 2, 3, 4, 4, 5)
  val uniqueList = removeDuplicates(myList)
  println(uniqueList)

  def removeConsecDuplicates[A](list: List[A]): List[A] = list match {
    case Nil => Nil
    case head :: tail =>
      head :: removeConsecDuplicates(tail.dropWhile(_ == head))
  }

  val myList2 = List(1, 1, 1, 2, 2, 1, 1, 3, 4, 3, 3, 3, 3, 4, 5)
  val result= removeConsecDuplicates(myList2)
  print(result)


}
