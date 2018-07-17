package com.knoldus.akhilesh

import org.scalatest.FunSuite

class EmployeeInfoSpec extends FunSuite {

  val emp = new EmployeeInfo


  test("Finding Employee with salary greater than 35000") {
    val actualResult = emp.empDetail(Map(1 -> 25000, 2 -> 37000, 3 -> 50000, 4 -> 15000, 5 -> 40000, 6 -> 35000, 7 -> 38000))
    val expectedResult = Map(2 -> 37000.0, 3 -> 50000.0, 5 -> 40000.0, 7 -> 38000.0)
    assert(actualResult === expectedResult)
    //actualResult must equal (expectedResult)
  }

  test("Checking for revise salary function") {
    val actualResult = emp.reviseSalary(Map(1 -> 18000.0, 2 -> 25000.0, 3 -> 10000.0, 4 -> 36000.0, 5 -> 50000.0, 6 -> 35000.0, 7 -> 40000.0))
    val expectedResult = Map(1 -> 36000, 2 -> 37500, 3 -> 20000, 4 -> 54000, 5 -> 62500, 6 -> 52500, 7 -> 60000)

    assert(actualResult === expectedResult)
  }

}
