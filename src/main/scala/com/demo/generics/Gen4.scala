package com.demo.generics

object Gen4 extends App {
  class Animal
  class Dog extends Animal
  class Cat extends Animal

  // T >: Dog means T can be Dog or any supertype of Dog
  class adopt[T >: Dog](val pet: T)

 val dog= new adopt[Dog](new Dog) // Works fine
  //val cat= new adopt[Cat](new Cat) //doesnt work
  val str= new adopt[Any]("not a pet")

  implicit val gtMsg:String="Helllo"

  def greet(name:String, greetMsg:String): Unit = {
    println(s"$name $greetMsg")


  }
  def greet2(name:String,greetMsg:String=gtMsg): Unit = {
    println(s"$name $greetMsg")

  }






}
