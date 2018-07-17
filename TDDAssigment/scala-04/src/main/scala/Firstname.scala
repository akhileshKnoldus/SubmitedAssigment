class Firstname(val fName : String) extends AnyVal

class Lastname(val lName : String) extends AnyVal
class Age(val age : Int) extends AnyVal

class PrintDetail {

  def displayDetail(first :Firstname,last :Lastname,age :Age): String =
  {
    s"${first.fName} ${last.lName} is of ${age.age}"
  }

  val first=new Firstname("Prashant")
  val last=new Lastname("Goel")
  val age=new Age(24)

  println(displayDetail(first,last,age))
}


