
val alpha = List("a", "b", "a")

alpha match {
  case List(_, a, _) => println("List has size 3" + a)

}

val x:Option[Int]= Some(1)

val y:Option[Int] = None

