import org.scalatest.{FunSuite, MustMatchers}

class FirstnameSpec extends FunSuite with MustMatchers{

  val firstname=new Firstname("Ram")
  val lastname=new Lastname("Sharma")
  val age=new Age(21)
    val p=new PrintDetail
  test("Comparing Names") {
    val actualResult = p.displayDetail(firstname,lastname,age)
    val expectedResult = "Ram Sharma is of 21"
    actualResult must equal(expectedResult)
  }
}
