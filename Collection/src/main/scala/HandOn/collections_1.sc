import scala.collection.immutable.{HashMap, LinearSeq, SortedSet}
import scala.collection.mutable

//every kind of collection can be created by the same uniform syntax
val traversable = Traversable(1, 2, 3)
Iterable("x", "y", "z")
Map("x" -> 24, "y" -> 25, "z" -> 26)
Set("Red", "Green", "Blue")
SortedSet("hello", "world")
mutable.Buffer(1, 2, 5)
IndexedSeq(1.0, 2.0)
LinearSeq(7, 8, 1)
val list = List("a" -> 1, "b" -> 2, "x" -> 24, "y" -> 25, "z" -> 26)
Map("x" -> 24, "y" -> 25, "z" -> 26, "a" -> 20, "b" -> 60, "c" -> 10, "p" -> 90)
Vector("A","B")

//specific collection implementations
List(1, 2, 3)
HashMap("x" -> 24, "y" -> 25, "z" -> 26)


println("vhdsfhg")
val result: Unit = traversable.foreach(println)
//.println

val itr = list grouped(2)
itr.next()
itr.next()

val itr2 = list sliding 2

itr2.next()
itr2.next()




val list2 = List(1, 2, 3)

list2.map(ele => ele + 1)
list2.foreach(ele => ele + 1)




