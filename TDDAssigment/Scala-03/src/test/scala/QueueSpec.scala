
import org.scalatest.FunSuite


class QueueSpec extends FunSuite {


  val doubleQueue= new DoubleQueue with Queue
  val squareQueue= new SquareQueue with Queue


  test(testName = "Doubles the Element" ) {
    val actualResult = doubleQueue.enqueue(3)
    val expectedResult = List(6)
    assert(actualResult === expectedResult)
  }

  test(testName = "Squares the Element" ) {
    val actualResult = squareQueue.enqueue(3)
    val expectedResult =List(9)
    assert(actualResult === expectedResult)
  }

}

