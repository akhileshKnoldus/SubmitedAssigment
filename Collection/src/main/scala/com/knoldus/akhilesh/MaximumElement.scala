package com.knoldus.akhilesh

class MaximumElement {

  val list=List.range(5,8)

  def firstFiveMaxElement(ele:Int):List[Int]={

   // println("Before Sorting"+list)
    val sortedList=list.sorted

    //println("After Sorting="+sortedList)
    val modifiedList=sortedList.takeRight(ele).map(_ *5)

   // println(modifiedList)
    modifiedList

  }

}
