package com.knoldus.akhilesh

import org.scalatest.{FunSuite, MustMatchers}

class ArithmaticDemoSpec extends  FunSuite with MustMatchers{

  val testArithmatic = new ArithmaticDemo

  test("Add 2 Valid Integer") {
    val actualResult = testArithmatic.add(1, 2)
    val expectResut = 3
   //assert(actualResult === expectResut)

    actualResult must equal(expectResut)
  }


  test("Numerator/Denominator both are Positive"){
    val actualResult = testArithmatic.division(1, 1)
    val expectResut = 1
    assert(actualResult === expectResut)
  }

  test("Divide by Zero"){
    assertThrows[IllegalArgumentException]{
      testArithmatic.division(2,0)
    }
  }
  test("Numerator/Denominator and Denominator is not equal to Zero"){

  }
}
