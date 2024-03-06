package com.demo.implicits

object ImplicitsTwo extends App{

  case class Person(name:String){
    def greet=s"hi my name is $name"
  }
  implicit def stringToPerson(str:String):Person=Person(str)
   println("Ravi".greet) // stringtoperson("ravi").greet

  def increment(x:Int)(implicit amount:Int)= x+amount
  implicit val defValue =5
  println(increment(2)(amount = 12))
}
object ImplicitOrganizing extends App {

  //val var def

// implicit val reverseOrdering:Ordering[Int]= Ordering.fromLessThan(_>_)
 implicit def normalOrdering: Ordering[Int] = Ordering.fromLessThan(_ > _)

  println(List(1, 3, 4, 2, 5).sorted)

  case class Person(name: String, age: Int)

  val persons = List(
    Person("Ravi", 22),
    Person("Balaji", 23),
    Person("Teja", 24)
  )

  implicit val orderingList: Ordering[Person] = Ordering.fromLessThan((a, b) => a.name.compareTo(b.name) < 0)

  println(persons.sorted)


  case class Purchases(noOfUnits: Int, unitPrice: Double)

  object Purchases {
    implicit val totalPrice: Ordering[Purchases] = Ordering.fromLessThan((a, b) => a.noOfUnits * a.unitPrice < b.noOfUnits * b.unitPrice)
  }

  object UnitCount {
    implicit val unitCount: Ordering[Purchases] = Ordering.fromLessThan(_.noOfUnits < _.noOfUnits)
  }

  object UnitPrice {
    implicit val unitPrice: Ordering[Purchases] = Ordering.fromLessThan(_.unitPrice > _.unitPrice)

  }
  val purchasesList = List(
    Purchases(10, 5.0),
    Purchases(6, 10.0),
    Purchases(8, 8.0)
  )
   //Using the implicit totalPrice Ordering
//  val sortedByTotalPrice = purchasesList.sorted
//  println(sortedByTotalPrice)
//  import UnitPrice._
  val sortedByUnitCount = purchasesList.sorted
  println(sortedByUnitCount)

}
