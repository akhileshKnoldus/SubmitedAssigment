
class Person (val name: String, val age: Int) extends Ordered[Person]{

  //def compare(x:Person,y:Person)=x.name compare y.name
  def compare(that: Person): Int = {
    if(this.name == that.name) this.age-that.age
    else this.name.length - that.name.length
  }
}

object PersonTest extends App{

  val p1 = new Person("Test", 35)
  val p2 = new Person("Test", 20)
 // println(p1>p2)
}
