package com.demo.oops

import org.scalatest.funsuite.AnyFunSuite

class GenTypesSpec extends AnyFunSuite{
  test("reverse1 should reverse elements in pairs") {

    assert(Genreverse1(List("a", "b", "c", "d")) === List("b", "a", "d", "c"))
    // Add more test cases as needed
  }

  test("Complex addition and subtraction should work correctly") {
    val complex1 = Complex(8.0, 3.0)
    val complex2 = Complex(6.0, 2.0)

    val sum = complex1 + complex2
    val diff = complex1 - complex2

    assert(sum == Complex(14.0, 5.0))
    assert(diff == Complex(2.0, 1.0))
  }

  test("Complex toString should return a string representation") {
    val complex = Complex(8.0, 3.0)
    assert(complex.toString == " 8.0 +3.0")
  }

  // Add more test cases as needed


}
