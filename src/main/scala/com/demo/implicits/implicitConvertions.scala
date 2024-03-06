package com.demo.implicits

object implicits extends App {

  case class Speed(speed: Int)
  implicit def speedOfThing(speed: Int): Speed = Speed(speed)
  val spd: Speed = 7

  implicit def intToDouble(speed: Int) = Speed(speed)
  val spd2:Double = 7


  case class Distance(meters: Double)
  implicit def intToDistance(meters: Double): Distance = Distance(meters)
  val distance: Distance = 3.87

  // scala boxing and unboxing -> it is auto conversion example double can accept int and float values as it accepts some
  case class Distance2(meters:Int)
  implicit def intToDistance(meters: Int): Distance2 = Distance2(meters)
  val dist: Distance2 = 123
  //type


  implicit class AddingString(name: String) {
    def hurray: String = name + "!!!!!!"
  }
  val name: String = "Teja"
  val excitedGreeting: String = name.hurray
  // Teja !!!!!!

}
