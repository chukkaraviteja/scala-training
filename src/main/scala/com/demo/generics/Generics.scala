package com.demo.generics

object Generics extends App {

  class Mylist[A]{

    def rondom[A](elem:A):A= elem
  }
  val listOfInt= new Mylist[Int]
  listOfInt.rondom("sdsdgwg")

  val listOfStr= new Mylist[String]
 // basically generics allow us to reuse the code we don't have to duplicate the code for different types

  // generic methods
  object Mylist{
    // objects are not type parameterized
    def empty[A]:Mylist[A]= ???
  }
  val list= Mylist.empty[Int] // val list= Mylist :::list.empty[Int] are the same
  // we wrote  val list= Mylist.empty[Int] because companion object doesn't create any new instance as it already a singleton object

  //varience

  class Animal
  class Dog extends Animal
  class Cat extends Animal

  // there are 3 types of varience 1.covarience 2.noVarience 3.contravarience

  // covience[+] Covariant types vary "nicely" with subtyping.This means that if A is a subtype of B, then C[A] is considered a subtype of C[B]
  class Covarience[+A]
  val animal:Animal= new Dog
  val listOfAnimals:Covarience[Animal]= new Covarience[Dog]

//Invariant types also called noVarience they do not vary with subtyping. This means that C[A] and C[B] are not related in any way, even if A is a subtype of B.
  class Novarience[A]
  val animal1:Animal= new Animal
  val listOfAnimals1:Novarience[Animal]= new Novarience[Animal]

  //Contravariant types vary "in the opposite direction" with subtyping. This means that if A is a subtype of B, then C[B] is considered a subtype of C[A].
  class Contravarience[-A]
  val animal2:Animal= new Dog
  val ListOfAnimals2:Contravarience[Dog]= new Contravarience[Animal]

  //bounded types



}
