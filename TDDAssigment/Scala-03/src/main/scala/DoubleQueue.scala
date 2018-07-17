
//import scala.collection.mutable.ListBuffer

class DoubleQueue extends Queue{

  override def enqueue(newElement: Int): List[Int]= {
    queue +=(2 * newElement)
    println(s"new queue: $queue")
    queue.toList
  }
}
class SquareQueue extends Queue{

  override def enqueue(element: Int): List[Int]= {
    queue += (element * element)
    println(s"new queue: $queue")
    queue.toList
  }
}

