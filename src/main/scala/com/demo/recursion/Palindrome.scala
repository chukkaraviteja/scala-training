package com.demo.recursion

object Palindrome extends App{

  def palindrome(name:String):Boolean={
    def palinHelper(name:String,first:Int,last:Int):Boolean={
      if(first>=last){
        true
        }
      if(name.charAt(first)!=name.charAt(last))//name(first)!=name(last)
        {
        false
      }
      else{
        palinHelper(name,first+1,last-1)
      }
    }
    val n:Int= name.length-1
    palinHelper(name,0,n)
  }
  println(palindrome("abab"))




  var rev=0
  def reverse(number: Int,rev:Int):Int={
   if(number==0)
     rev

   else reverse(number/10,(rev*10 + number%10))
  }
 println( reverse(321,rev))


}
