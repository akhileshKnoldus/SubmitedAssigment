
package com.knoldus.TDDAssigmnet

trait Queue {
  val list = new scala.collection.mutable.ListBuffer[Int]
  def dequeue(): Option[Int] = {
    if(list.isEmpty){
      println("No element found")}
    else
      list.remove(0)
      None
  }

  def enqueue(x: Int): list.type = {
    list += x
  }

  def showQueue(): Unit = {
    println(list.mkString(","))
  }
}

class DoubleQueue extends Queue {

  override def enqueue(x: Int): list.type = super.enqueue(2*x)
}

class SquareQueue extends Queue {

  override def enqueue(x: Int): list.type = super.enqueue(x*x)
}