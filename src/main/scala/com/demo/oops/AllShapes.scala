package com.demo.oops
object AllShapes extends App {

  abstract class DifferentShapes { //hospital
    def area(): Double // def manage:unit
  }

  case class Circle(radius: Double=5) extends DifferentShapes { //doctor
    override def area: Double = {
      math.Pi * radius * radius
    }
  }

  case class Rectangle(length: Int, breadth: Double) extends DifferentShapes {
    override def area: Double = {
      length * breadth
    }
  }

  case class Square(side: Double) extends DifferentShapes {
    override def area: Double = side * side
  }

  case class Triangle(base: Double) extends DifferentShapes {
    override def area: Double = 0.5 * base

  }
  val circle= Circle(4.5)
  println(circle.area)
  val square= Square(5.8)
  val triangle= Triangle(2.5)
  println(triangle.area)

  trait A {
    def name
  }
  trait B extends A{
    def name  = println("B")
  }
  trait C extends A {
    def name  = println("C")
  }
  trait E extends A {
    def name  = println("E")
  }
  class D extends C with E with B {
    override def name  = super.name
  }

  val ad = new D
  println(ad.name)


}





