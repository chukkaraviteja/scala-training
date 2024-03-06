package com.demo.hofs

object HofBasics extends App {

  def tabler(f:(Int)=>Int,n:Int,x:Int ):Int={
    if(n<=0) x
    else tabler(f, n-1,f(x))
  }
  val table= (a:Int)=>a+1
  val valuesOfTable= tabler(table,5,1)
  println(valuesOfTable)

  val addTwo: Int => Int = (x: Int) => x + 1
  def square:Int=>Int = (x:Int)=>x*x
  val rel2= (square(2))
  val result=  addTwo(3)

  println(result)

}

