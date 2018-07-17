package com.knoldus.akhilesh

object Test {
  def main(args: Array[String]):Unit = {
    println("ListDemo")
    val listDemo=new ListDemo
    listDemo.multiplicationOfElement(9)

    println()
    println("********************************")

    val maximumElement =new MaximumElement

    println(maximumElement.firstFiveMaxElement(5))

    /*println("***********************************")
    val frequencyOfCharacter=new FrequencyOfCharacter
    frequencyOfCharacter.countCharcter("i am indian")*/
  }
}
