package com.knoldus.akhilesh

import scala.collection.immutable.HashMap

class FrequencyOfCharacter {
  val count = new HashMap[Char, Int]()

  def countCharcter(input: String): HashMap[Char, Int] = {

   for (i <- input)  {
      if (count.contains(i)) {

        //println(count.put(i, count(i) + 1))
        count.put(i, count(i) + 1)
      }
      else {
        count.put(i, 1)
        //println(count.put(i, 1))
      }
    }
    count
  }

    /* def countCharcter(input:String):Map[Char,Int]={
       //println(input.groupBy(identity).mapValues(_.size))


       input.toList.filter(_ != ' ').groupBy(identity).mapValues(_.size)
     }*/
}

