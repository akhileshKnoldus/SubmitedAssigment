import org.scalatest.FunSuite
class PersonSpec extends FunSuite {


  test("for true outputs") {
    val testPerson = new Person("AKHILESH", 21)
    val testPerson1 = new Person("AKHILESH", 24)
    val actualResult = (testPerson < testPerson1)
    val expectedResult = true
    //actualResult must equal(expectedResult)
    assert(actualResult === expectedResult)
  }
  test("for false outputs") {
    val testPerson = new Person("AKHILESH", 21)
    val testPerson1 = new Person("AKHILESH", 24)
    val actualResult = (testPerson > testPerson1)
    val expectedResult = false
    //actualResult must equal(expectedResult)
    assert(actualResult === expectedResult)
  }

  test("for different names") {
    val testPerson = new Person("AKHILESH", 21)
    val testPerson1 = new Person("Gupta", 24)
    val actualResult = (testPerson > testPerson1)
    val expectedResult = true
    //actualResult must equal(expectedResult)
    assert(actualResult === expectedResult)
  }
}