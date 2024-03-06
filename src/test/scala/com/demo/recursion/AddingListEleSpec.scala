package com.demo.recursion

import org.scalatest.funsuite.AnyFunSuite
class AddingListEleSpec extends AnyFunSuite{

  test("checking the addition of values"){

    assert(AddingListEle.addingEle(List(2,3,4,5):List[Int])===14)
  }

}
