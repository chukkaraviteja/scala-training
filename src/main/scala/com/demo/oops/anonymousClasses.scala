package com.demo.oops

object anonymousClasses extends App {
  abstract class Animal{
   def eat:Unit
//    def sing:Unit
  }
  val dog = new Animal {
    override def eat:Unit = println("i eat non veg")
  }
  dog.eat
  println(dog.getClass) // class com.demo.oops.anonymousClasses$$anon$1
  // anonymousClasses$$anon$1 is the anonymous class what it does is
  // class anonymousClasses$$anon$1 extends Animal{  override def eat: Unit = println("i eat non veg")}
  // val dog = new anonymousClasses$$anon$1

  class Person{
    def nameIs(name:String):Unit=println(s"my name is $name")
  }
   val crt = new Person
  //  {
//    override def nameIs: Unit = println(s"my name is ${this}")
//
//  }
  crt.nameIs("crt")

}
