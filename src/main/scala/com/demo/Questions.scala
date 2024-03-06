package com.demo

object Questions extends App {
//Example 1:
//  Input: s = List(“abcabcbb”)
//  Output: 3
//  Explanation: The answer is "abc", with the length of 3.
//  Example 2:
//    Input: s = List”bbbbb”)
//  Output: 1
//  Explanation: The answer is "b", with the length of 1.
//  Example 3:
//    Input: s = List(“pwwkew”)
//  Output: 3
//  Explanation: The answer is "wke", with the length of 3.
//  Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
//  09:36 AM
//   Input: s = List(“a", "b" ,"c", "a", "b", "c", "b", b”)
//  09:37 AM
//    Non repeating logestest element from the list
//  09:38 AM
//    Input: s = List(1,2,3,1,2,3,2,2)
//  09:40 AM
//    3
//  09:40 AM{

//  def isPrime(n:Int):Int={
//
//
//  }
   def fact(n:Int):Int={
     def factHelper(n:Int,acc:Int):Int={
       n match{
         case 1 =>acc
         case _=> factHelper(n-1,acc*n)
       }
     }
     factHelper(n,1)
   }
  println(fact(5))

  def fibonacci(n:Int):Int={
    def fibHelper(n:Int,second:Int,third:Int):Int={
      n match {
        case 0=>0
        case 1=> second
        case _=> print(s"$second,")
          fibHelper(n-1,third,second+third)
      }
    }
    fibHelper(n,0,1)
  }
  println(fibonacci(5))

  def fibList(n:Int):List[Int]={
    def fibHelper(n:Int,sec:Int,third:Int):List[Int]={
      n match {
        case 0=> List()
        case 1=> List(sec)
        case _=> sec::fibHelper(n-1,third,sec+third)
      }
    }
    fibHelper(n,0,1)
  }
  println(fibList(7))

  def concatStr(n:Int):String={
    def conHelper(n:Int ,str:String,acc:String):String={
      n match {
        case 0=>acc
        case _=> conHelper(n-1,str,acc+str)
      }
    }
    conHelper(n,"teja,","")
  }
  println(concatStr(10))

//abstract class Mylist{
//    def head:Int
//    def tail:Mylist
//    def isEmpty:Boolean
//    def add(element:Int):Mylist
//  }
//
//  object Empty extends Mylist {
//    def head:Int=throw new NoSuchElementException
//    def tail:Mylist=throw new NoSuchElementException
//    def isEmpty:Boolean=true
//    def add(element:Int):Mylist= new Cons(element,Empty)
//  }

//  class Cons(head:Int,tail:Mylist)extends Mylist{
//
//    def add(element:Int):Mylist= new Cons(element,this)
//
//  }


}

