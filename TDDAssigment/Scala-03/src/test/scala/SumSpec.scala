import org.scalatest.{FunSuite, MustMatchers}

class ArithmeticSpec extends FunSuite with MustMatchers{

  val testSum = new Sum



  test("Checking for sum of positive numbers"){
    val actualResult = testSum.sum(testSum.int, 4, 5)
    val expectedResult = 9
    //actualResult must equal(expectedResult)
    assert(actualResult===expectedResult)
  }

  test("Checking for sum of negative numbers"){
    val actualResult = testSum.sum(testSum.int, -4, -5)
    val expectedResult = -9
    //actualResult must equal(expectedResult)
    assert(actualResult===expectedResult)
  }

  test("Checking for sum of squares for positive numbers"){
    val actualResult = testSum.sum(testSum.square, 4, 5)
    val expectedResult = 41
    //actualResult must equal(expectedResult)
    assert(actualResult===expectedResult)
  }

  test("Checking for sum of squares for negative numbers"){
    val actualResult = testSum.sum(testSum.square, -4, -5)
    val expectedResult = 41
    //actualResult must equal(expectedResult)
    assert(actualResult===expectedResult)
  }

  test("Checking for sum of cubes for positive numbers"){
    val actualResult = testSum.sum(testSum.cube, 4, 5)
    val expectedResult = 189
    //actualResult must equal(expectedResult)
    assert(actualResult===expectedResult)
  }

  test("Checking for sum of cubes for negative numbers"){
    val actualResult = testSum.sum(testSum.cube, -4, -5)
    val expectedResult = -189
   // actualResult must equal(expectedResult)
    assert(actualResult===expectedResult)
  }

  test("Checking for sum of cubes for negative and positive numbers"){
    val actualResult = testSum.sum(testSum.cube, 4, -5)
    val expectedResult = -61
   // actualResult must equal(expectedResult)
    assert(actualResult===expectedResult)
  }



}