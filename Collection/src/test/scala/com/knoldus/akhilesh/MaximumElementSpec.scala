package com.knoldus.akhilesh

import org.scalatest.FunSuite

class MaximumElementSpec  extends  FunSuite{

   val maximumElement=new MaximumElement

  test("Top Five max Element"){
  val expextedResult=List(65, 70, 75, 80, 85)
  val actualResult=maximumElement.firstFiveMaxElement(5)

  assert(actualResult === expextedResult)
}}
