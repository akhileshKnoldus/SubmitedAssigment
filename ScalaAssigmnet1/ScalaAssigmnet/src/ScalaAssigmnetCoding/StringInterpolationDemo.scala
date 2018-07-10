package ScalaAssigmnetCoding

class StringInterpolationDemo {

  def listDemo(list: List[Int]):Unit ={
    val  arr=list.toArray

    for(i<- 0 until(arr.length-1)){

     // println(i+"="+arr(i))

      println(s"$i = ${arr(i)}")
    }
  }

}

object mainObject{
  def main(args:Array[String]): Unit ={
    val list=List(10,20,30,40)
    println("Avilable List")
    println(list)
    val s= new StringInterpolationDemo()
    s.listDemo(list)
  }
}