import org.scalatest.{FunSuite, MustMatchers}

import scala.collection.mutable.ListBuffer

class QueueSpec extends FunSuite with MustMatchers{

  val queue = new Queue with DoubleQueue with SquareQueue

  test("Doubling and Squaring 5") {
    val actualResult = println(queue.enqueue(5))
    val expectedResult = List(50)
    actualResult must equal(expectedResult)
  }
  test("Doubling and Squaring 3") {
    val actualResult = println(queue.enqueue(3))
    val expectedResult = List(18)
    actualResult must equal(expectedResult)
  }
}
