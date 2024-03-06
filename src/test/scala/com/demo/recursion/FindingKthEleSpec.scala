package com.demo.recursion

import org.scalatest.funsuite.AnyFunSuite
class FindingKthEleSpec extends AnyFunSuite{

  test("checking Kth Element"){
    assert(FindingKthEle.kEle(List(2,3,4,5):List[Int],4))
  }

  test("checking Kth Element where element is not present in the list"){
    assert(!FindingKthEle.kEle(List(2,3,4,5):List[Int],6))
  }



}
