package com.knoldus.akhilesh

import org.scalatest.FunSuite

class ListDemoSpec extends  FunSuite{

  val listDemo=new ListDemo

  test("When we passs input 9"){
  val actualResult=listDemo.multiplicationOfElement(9)
  val expectedResult=List(0, 9, 18, 27, 36, 45, 54, 63, 72, 81, 90)
  assert(actualResult === expectedResult)


}}
