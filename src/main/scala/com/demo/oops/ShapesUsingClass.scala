package com.demo.oops

import sun.security.util.Length

import java.util.jar.Attributes.Name

class ShapesUsingClass {

  def areaOfTheCircle(name: String, radius: Double):Double = {
    //println(s"Area of $name ${math.Pi * radius * radius}")
    math.Pi*radius*radius
  }

  def areaOfTheRectangle(name: String, length: Int, breadth: Double): Unit = {
    println(s"Area of $name ${length * breadth}")
  }

  def areaOfTheSquare(name: String, side: Double): Unit = {
    println(s"Area of $name ${side * side}")

 }

  def areaOfTheTriangle(name: String, base: Double, height: Int):Unit = {
   println( s"Area of $name ${0.5 * base * height}")

  }

}
