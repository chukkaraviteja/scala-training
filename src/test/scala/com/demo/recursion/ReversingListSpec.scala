package com.demo.recursion

import org.scalatest.funsuite.AnyFunSuite
class ReversingListSpec extends AnyFunSuite{

  test("checking the reverse of the list"){
    assert(ReversingList.reversingList(List(2,3,4,5):List[Int])===List(5,4,3,2))
  }

  test("checking reverse of the list using tailRecursion"){
    assert(ReversingList.reverse(List(2,3,5,9,8):List[Int])===List(8,9,5,3,2))
  }



}
