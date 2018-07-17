
package com.knoldus.TDDAssigmnet

class Area {
  {
    def rectangle(a: Int, b: Int): Int = a * b
    def parallelogram(a: Int, b: Int): Int = {
      a * b
    }
    def rhombus(a: Int, b: Int): Int = {
      (a * b) / 2
    }
    def areaCalculation(f: (Int, Int) => Int, first: Int, second: Int): Int = {
      f(first, second)
    }
  }
}
