

import com.knoldus.TDDAssigmnet.Area
import org.scalatest.{FunSuite, MustMatchers}

class Test extends  FunSuite with MustMatchers {

  var area = new Area
  test("Area of Rectangl") {
    val actualResult = area.rectangle()
    val expectResut = 3

  }
}