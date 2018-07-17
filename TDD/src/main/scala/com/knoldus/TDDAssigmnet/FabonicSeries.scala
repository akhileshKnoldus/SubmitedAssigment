
package com.knoldus.TDDAssigmnet

object FabonicSeries extends App{
  def fabonic(num:Int):Int={
    println("0")
    println("1")
    def fibo(a:Int,b:Int,i:Int):Int={
      if (i==num-3) {
        println(a+b)
        a+b
      }
      else{
        println(a+b)
        fibo(b,a+b,i+1)
      }
    }
    fibo(0,1,0)
  }
  fabonic(7)
}