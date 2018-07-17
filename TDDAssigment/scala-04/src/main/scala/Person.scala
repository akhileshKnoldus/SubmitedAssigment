class Person(val name: String, val age: Int) extends Ordered[Person] {

  def compare(that: Person): Int = {
    if (this.name == that.name)
      this.age - that.age
    else
      this.name.length - that.name.length
  }
}

class check  {

  val personOne = new Person("test1", 24)
  val personTwo = new Person("test", 25)

  println(personOne > personTwo)
}