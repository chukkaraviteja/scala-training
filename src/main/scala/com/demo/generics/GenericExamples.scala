package com.demo.generics

object GenericExamples extends App {

  class Box[T]( val value: T)
  val intBox = new Box(42)    // Create a Box containing an Int
  val stringBox = new Box[String]("Hello")
  println(intBox.value)

  // Define the trait Animal
  trait Animal {
    def speak(): Unit
  }
  // Define a case class Dog implementing the Animal trait
  case class Dog(name: String) extends Animal {
    def speak(): Unit = println(s"$name says Woof!")
  }
  // Define the object AnimalObject with a method returning an Animal
  object AnimalObject {
    def createAnimal(name: String): Animal = {
      Dog(name) // Return a Dog instance
    }
  }
  // Usage
  val buddy: Animal = AnimalObject.createAnimal("Buddy")
  buddy.speak() // Output: Buddy says Woof!
  val canine:Animal= AnimalObject.createAnimal("k9")
  canine.speak()

  class Mylist[A]{
    def random[A](elem:A):Unit= println(elem)
  }
  val listOfInt= new Mylist[Int]
  val listOfStr= new Mylist[String]
   println(listOfInt.random(43))
   println(listOfStr.random("teja"))

  object MyList {
    def empty[A]: List[A] = List.empty[A]
  }

  val intList: List[Int] = MyList.empty[Int]
  val stringList: List[String] = MyList.empty[String]
     println(intList.empty)


  class Animal1
  class Dog1 extends Animal1
  class Cat1 extends Animal1

  // Covariant class
  class Covariant[+A](val value: A)

  val dogCovariant: Covariant[Dog1] = new Covariant[Dog1](new Dog1)
  val animalCovariant: Covariant[Animal1] = dogCovariant // Covariance allows this assignment
    println(animalCovariant)

}


