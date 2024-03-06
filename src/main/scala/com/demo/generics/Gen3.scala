package com.demo.generics

object Gen3 extends App {
  class Animal
  class Dog extends Animal
  class Cat(val name:String) extends Animal

  // T <: Animal means T can be Animal or any subtype of Animal
  class Cage[T <: Animal](val animal: T)

  val dog = new Dog
  val dogCage = new Cage[Dog](dog) // Works fine
  val catCage = new Cage[Cat](new Cat("bummy")) // Works fine
  // This will cause a compilation error because Int is not a subtype of Animal
  //val intCage = new Cage[Int](1)
 // println(dogCage.animal.name)


}
