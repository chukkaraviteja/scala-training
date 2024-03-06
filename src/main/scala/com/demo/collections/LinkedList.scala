package com.demo.collections

object LinkedList extends App {

  abstract class Mylist[A]{
    def head:A
    def tail:Mylist[A]
    def isEmpty:Boolean
    def add(elem:A):Mylist[A]
    def printElements:String
    override def toString: String = s"[  ${printElements}  ]"

    def map[B](transformer: MyTransformer[A,B]):Mylist[B]

  }

  class Empty[A] extends Mylist[A]{
    override def head: A = throw new NoSuchElementException
    override def tail:Mylist[A] = throw new NoSuchElementException
    override def isEmpty: Boolean = true
    override def add(elem: A):Mylist[A]= new Cons[A](elem,new Empty)
    override def printElements: String = " "

    override def map[B](transformer: MyTransformer[A, B]): Mylist[B] = ???
  }

  class Cons[A](h:A,t:Mylist[A]) extends Mylist[A] {
    override def head:A= h
    override def tail: Mylist[A] = t
    override def isEmpty: Boolean = false
    override def add(elem: A):Mylist[A]= new Cons[A](elem,this)
    override def printElements: String = {
      if(t.isEmpty==true) s"$h"
      else s"$h" +"," +t.printElements
    }

    override def map[B](transformer: MyTransformer[A, B]): Mylist[B] = ???
  }
  val list=new Cons[Any]("rAm",new Cons[Any](2,new Empty[Any]))
  //println(list.toString)
  println(list)


  trait MyPredicate[-T]{
    def test(elem:T):Boolean
  }
  trait MyTransformer[-A,B]{
    def transformer(elem:A):B
  }

}


