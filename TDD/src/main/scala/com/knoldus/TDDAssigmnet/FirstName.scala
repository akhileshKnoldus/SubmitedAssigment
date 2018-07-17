
package com.knoldus.TDDAssigmnet

class FirstName(val firstName:String) extends AnyVal{
  override def toString()=firstName
}

class LastName(val lastName:String) extends AnyVal{
  override def toString()=lastName

}
class Age(val age:Int) extends AnyVal{
  override def toString()=age.toString()
}

object AnyValDemo extends App{
  def display(fName:FirstName,lName:LastName,age1:Age)={
    println(fName +" "+lName.toString+" " +age.toString)
    //     println(fName.firstName+" "+lName.lastName+" is of "+age1.age+" year")
  }

  val fName=new FirstName("Akhilesh")
  val lName=new LastName("Gupta")
  val age=new Age(24)
  /* println(fName.firstName+lName.lastName+age.age)*/
  //Pass object in function
  display(fName,lName,age)
}