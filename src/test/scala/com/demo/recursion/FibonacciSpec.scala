package com.demo.recursion

import org.scalatest.funsuite.AnyFunSuite
class FibonacciSpec extends AnyFunSuite {

  test("checking fibonacci") {
    assert(Fibonacci.fibonacci(10) === 55)
  }

}


