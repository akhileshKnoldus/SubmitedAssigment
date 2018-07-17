
/*Two Dimensional Lists*/

val twodim: List[List[Int]] =
  List(
    List(1, 0, 0),
    List(0, 1, 0),
    List(0, 0, 1)
  )


/*Basic Operations*/

val names = "Harry" :: ("Adam" :: ("Jill" :: Nil))

val age = Nil

println("Head of names array : " + names.head)
println("Tail of names array : " + names.tail)
println("Check if names is empty : " + names.isEmpty)
println("Check if age is empty : " + age.isEmpty)


/*Range*/

val listUsingRange = List.range(1, 10)

/* range function can take a third argument which serves as a "step" value */

val listWithSteps = List.range(0, 10, 2)

/*Fill method*/

val x = List.fill(3)("foo")

/*Tabulate*/

val tabList = List.tabulate(5)(n => n + n)

/*prepending*/

24 :: listUsingRange

/*appending*/

listUsingRange ::: listWithSteps

/*Concatenate*/

val concat = List.concat(listUsingRange, listWithSteps)

/*Zip*/

val a = List(1, 2, 3)
val b = List("a", "b")
val c = List(2, 5, 7)
val listWithZip = a.zip(b)

val y = (a, b, c) zipped

val listOfList = List(List(1, 2, 3), List(8, 9, 111), List(67))

listOfList.map(_.filter(p => p > 7))

listOfList.flatMap(_.filter(p => p > 7))

val listOfMisc = List(1, 2, List(3, 4))


val listOfLists = List(List(1, 3), List(4, 5), List(6, 7))

listOfLists.flatMap(_.map(_ + 1))








// 0 1 1 2 3 5 8 13

def fibonacci(num: Int) : List[Int] = {

  def fib(series: List[Int]) : List[Int] = {
    series.reverse match {
      case a::b::_  if series.size < num => fib(series :+ (a+b))
      case _ => series
    }
  }

  fib(List(0,1))
}


fibonacci(10)

