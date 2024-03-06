package com.demo.oops

object Inheritance extends App {
  abstract class Mylist{
    def head:Int
    def tail:Mylist
    def isEmpty:Boolean
    def add(elem:Int):Mylist
  }
  class Empty extends Mylist {
    override def head: Int = throw new NoSuchElementException

    override def tail: Mylist = throw new NoSuchElementException

    override def isEmpty: Boolean = true
    override def add(elem: Int):Mylist = new Cons(elem,this)
  }
  class Cons(h:Int,t:Mylist) extends Mylist{
    override def head:Int=h

    override def tail: Mylist = t

    override def isEmpty: Boolean = false

    override def add(elem: Int): Mylist= new Cons(elem,this)
  }

//  val list= new Cons(2,new Cons(3,new Cons(4,Empty)))
//  println(list.tail.tail.head)

}
