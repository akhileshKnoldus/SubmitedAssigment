package  com.knoldus.akhilesh

class ListDemo {

  val list=List.range(0,11)

  def multiplicationOfElement(num:Int):List[Int]={

    list.map(_* num)
    //print(modifiedList)

  }
}
