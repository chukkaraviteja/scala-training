package com.demo.recursion

import org.scalatest.funsuite.AnyFunSuite

class FiboTailRecSpec extends AnyFunSuite {
    test("checking fibonacci"){
      assert(FiboTailrec.fib(4)===2)
    }

}

