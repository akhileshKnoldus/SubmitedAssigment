
package com.knoldus.akhilesh
class ArithmaticDemo {

  def add(firstNumber:Int , secondNumber:Int): Int ={
    firstNumber + secondNumber
  }
  def division(numerator:Int , denominator:Int): Int ={
    require(denominator!=0)
    numerator / denominator
  }
}
