
package com.knoldus.TDDAssigmnet

class HigherOderFunctionDemo {
  def sum(f: (Int,Int) => Int,a: Int,b: Int): Int ={
    f(a,b)
  }

  /*def sumOfSquare(firstNum:Int,secondNum:Int)=scala.math.sqrt(firstNum)+scala.math.sqrt(secondNum)

  def sumOfCubes(firstNum:Int,secondNum:Int)=scala.math.cbrt(firstNum)+scala.math.cbrt(secondNum)

  def sumOfInt(firstNum:Int,secondNum:Int)=firstNum+secondNum
*/

  def sumOfSquare(firstNum:Int,secondNum:Int):Int={
    firstNum * firstNum + secondNum * secondNum
  }
  def sumOfCubes(firstNum:Int,secondNum:Int):Int={
    firstNum * firstNum * firstNum + secondNum *secondNum*secondNum
  }
  def sumOfInt(firstNum:Int,secondNum:Int):Int={
    firstNum + secondNum
  }
}

object CalculationHigherOderFunction {

  def main(args: Array[String]): Unit = {
    val higherOderFunctionDemo = new HigherOderFunctionDemo()

    val sumSquar = higherOderFunctionDemo.sum(higherOderFunctionDemo.sumOfSquare, 5, 4)
   // println(sumSquar)

    val cube = higherOderFunctionDemo.sum(higherOderFunctionDemo.sumOfCubes, 5, 4)
    ///println(cube)

    val sumInt = higherOderFunctionDemo.sum(higherOderFunctionDemo.sumOfInt, 5, 4)
   // println(sumInt)
    //   println(res)
  }
}