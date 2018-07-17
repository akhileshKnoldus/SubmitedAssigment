import scala.collection.mutable.ListBuffer

trait Queue{
  val queue=new ListBuffer[Int]

  def enqueue(element: Int):List[Int]

  def dequeue={
    if(queue.isEmpty)

      println("Queue is Empty")
    else
      println(s"Queue after Deletion: ${queue.remove(0)}")
  }
}