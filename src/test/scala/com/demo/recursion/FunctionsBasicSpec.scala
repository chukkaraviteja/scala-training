package com.demo.recursion

import org.scalatest.funsuite.AnyFunSuite

class FunctionsBasicSpec extends AnyFunSuite {
    test("checking multiplication"){
      assert(FunctionsBasics.multiply(1,2)===50.0)
    }

}
