package com.demo.generics

object Generics2 extends App {

  class Animal
  class Dog extends Animal

//  class Farm[-T](val produce: T) {
//    def produceAnimal: T = produce
//  }
//  val dog1= new Dog
//  val dogFarm: Farm[Dog] = new Farm[Dog](dog1)
//  val animalFarm: Farm[Dog] = dogFarm // Covariance allows this assignment
//   println(dogFarm.produce)

}
