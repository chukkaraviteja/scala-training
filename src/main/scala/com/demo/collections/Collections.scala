package com.demo.collections

object Collections extends App {
  def apply(i: Int, i1: Int, i2: Int, i3: Int, i4: Int) = ???


  // Creating a list using the apply method
  val myList = List(2,3,4,5,6)

  // Creating a list using cons operator
  val newList = 0 :: myList

  //accessing the elements
  println(myList.apply(0)) // mylist(0)

  //list operations
  // map filter flatmap foldleft fold right
  // 1.map
 // map iterates over each element of the list, applies a function to each element,
  // and returns a new list containing the results of applying the function to each element.

  // Define a function to double each element
  def double(x: Int): Int = x * 2

  // Apply the map operation to double each element of the list
  val doubledList = myList.map(double)
  println(s"Original list: $myList")       // Original list: List(1, 2, 3, 4, 5)
  println(s"Doubled list: $doubledList")   // Doubled list: List(2, 4, 6, 8, 10)

  // by using anonymous function operation
  val doubledList3 = Seq((24,23),3546 -> 34,45674 -> 45).map{
    case (x,y) => {

    }
  }

  // with place holder
  val doubledList2 = myList.map(_ * 2)

  //2.filter
  //filter iterates over each element of the collection and returns a new collection
  // containing only those elements for which the predicate function returns true

  // Define a predicate function to filter even numbers
  def isEven(x: Int): Boolean = x % 2 == 0

  // Apply the filter operation to select even numbers from the list
  val evenNumbers = myList.filter(isEven)

  println(s"Original list: $myList")   // Original list: List(1, 2, 3, 4, 5)
  println(s"Even numbers: $evenNumbers") // Even numbers: List(2, 4)

  //using anonymous
  val evenNumbers1 = myList.filter(x => x % 2 == 0)
  //using place holder
  val evenNumbers2 = myList.filter(_ % 2 == 0)

  //3.Flatmap
 //It takes a function that returns a collection for each element of the original collection
  // and then flattens the resulting collection of collections into a single collection.

  // Define a list of strings
  val myList2 = List("apple", "banana", "cherry")

  // Define a function that returns a list of characters for each string
  def getCharacters(s: String): List[Char] = s.toList

  // Apply flatMap to map each string to a list of characters and then flatten the result
  val characters = myList2.map(getCharacters)
  val characters2 = myList2.flatMap(getCharacters)

  println(s"Original list: $myList")   // Original list: List(apple, banana, cherry)
  println(s"Characters: $characters") //Characters: List(List(a, p, p, l, e), List(b, a, n, a, n, a), List(c, h, e, r, r, y))
  println(s"Characters: $characters2") // Characters: List(a, p, p, l, e, b, a, n, a, n, a, c, h, e, r, r, y)

  // 3.foldLeft
  //foldLeft takes an initial value and a binary operation as parameters. It starts with the initial value and iterates
  // through the collection from left to right (from the first element to the last element),
  // applying the binary operation to each element along with the accumulated result
  val sumLeft = myList.foldLeft(0)((acc, x) => acc + x)
  println(sumLeft)

  //4.foldRight
  val myStringList = List("Hello", ", ", "world", "!")
  val stringRight= myStringList.foldRight("")((x,acc)=>acc+x)
  println(stringRight)

  def fibo(n:Int):List[Int]= {
    (2 to n).foldLeft(List(1,0)) { (x,_) =>
      x match {
        case a :: b::_ =>(a + b ):: x //,1,0,1list(1,1,0) list(2,1,1,0) list(3,2,1,1,0) list(5,3,2,1,1,0)
        case _ => x
      }
    }.reverse
  }
    println(fibo(5))


  def fact(n: Int):Int = {
    if (n < 0) throw new Exception("Factorial is not defined for negative numbers")
    else if (n == 0 || n == 1) 1
    else (2 to n).foldLeft(1)((acc, y) =>acc * y) //foldLeft(1)((acc, y) =>acc * y)
  }
    val result3= fact(5)

  println(result3)












}
