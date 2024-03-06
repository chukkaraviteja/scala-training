package com.demo.generics

object Gen5 extends App {

  class Animal

  class Dog extends Animal

  class Cat extends Animal

  // T >: Dog means T can be Dog or any supertype of Dog

  def adopt[T >: Dog](pet: T): Unit = println("Adopted a pet")

  adopt[Animal](new Dog) // Works fine
  adopt(new Cat) // Works fine, as Cat is a subtype of Animal, which is a supertype of Dog
  //  adopt("not a pet") // Works fine, as String is a supertype of Dog
  // This will cause a compilation error because Int is not a supertype of Dog
  //  adopt(123)

  val some: (String, Int) => String = (name, age) => "my name is" + name + "and age is" + age


    def add(x: Int): Int = x * 2


}
