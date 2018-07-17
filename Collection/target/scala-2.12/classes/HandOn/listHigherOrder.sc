val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

//Foreach

list.foreach(println)

//Filter
val evens = list.filter(a => a % 2 == 0)

//takeWhile

val predicate = list.takeWhile(a => a < 6)

val predicate2= list.dropWhile(a => a < 6)

//map

list.map(ele => ele % 3)

list.map(_ * 3)


// Using Option

val names = List("tom", "jack", "jill")

names.map {
  case "tom" => "Hey Tom"
  case "jack" => "Hey Jack"
  case _ => "Hi !"
}


names.headOption match {
  case Some(name) => s"Hello how are you $name"
  case None => "Don't know who is it"

}