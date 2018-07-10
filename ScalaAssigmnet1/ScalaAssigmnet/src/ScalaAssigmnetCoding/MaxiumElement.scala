package ScalaAssigmnetCoding

class MaxiumElement {

  def maximum(list:List[Int]): Unit ={
    val arr=list.toArray
    var max= arr(0)

    for(i <- 0 until(arr.length) ){
      if(arr(i)>max){
        max=arr(i)
      }
      }
     println("Maxium Element is="+max)

  }

}

object  TestMaximumElement{
  def main(args: Array[String]): Unit = {
    val list=List(1,5,2,9,7);
    println("Avilble Element")
    println("--------------------")
    list.foreach(println)

    println("Max")
    println("--------------------")

    val maximumElement=new MaxiumElement()
    maximumElement.maximum(list)


  }
}