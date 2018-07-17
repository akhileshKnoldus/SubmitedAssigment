
val list=List.range(0,11)
// list.foreach(list=>list)

def multiplicationOfElementInList(input:Int): List[Any] ={
  if(input>0) {
    list.map(_ * 5).foreach(list)
    list

  }else{
    throw new  ArithmeticException
  }
  multiplicationOfElementInList(9)
}