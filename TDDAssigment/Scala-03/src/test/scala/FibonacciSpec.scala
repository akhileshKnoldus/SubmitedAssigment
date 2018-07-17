import org.scalatest.{FunSuite, MustMatchers}

class FibonacciSpec extends FunSuite with MustMatchers{

  val testFibonacci = new Fibonacci

  test("Check for positive integer"){
    val actualResult = testFibonacci.fiboSeries(7)
    val expectedResult = List(0, 1, 1, 2, 3, 5, 8)
    actualResult must equal(expectedResult)
  }

  test("Check for 1"){
    val actualResult = testFibonacci.fiboSeries(1)
    val expectedResult = List(0)
    actualResult must equal(expectedResult)
  }
  test("Check for 2"){
    val actualResult = testFibonacci.fiboSeries(2)
    val expectedResult = List(0, 1)
    actualResult must equal(expectedResult)
  }
  test("Check for negative numbers"){
    assertThrows[ArithmeticException]{
      testFibonacci.fiboSeries(-1)
    }
  }


}