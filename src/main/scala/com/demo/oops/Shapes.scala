package com.demo.oops

class Shapes(name:String) {

  def areaOfTheCircle( radius: Double): Unit = {
    println(s"Area of $name ${math.Pi * radius * radius}")
  }

  def areaOfTheRectangle( length: Int, breadth: Double): Unit = {
    println(s"Area of $name ${length * breadth}")
  }

  def areaOfTheSquare( side: Double): Unit = {
    println(s"Area of $name ${side * side}")
  }

  def areaOfTheTriangle(base: Double, height: Int): Unit = {
    println(s"Area of $name ${0.5 * base * height}")
  }

}
