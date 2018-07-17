/*
package com.knoldus.akhilesh
/*

class EmployeeInformation {

  var employeeDetails: Map[Int, Int]

def employeeSalary(id:Int,salary:Int):Map[Int,Int]={



}

}
*/
class EmployeeInformation {

  def employeeSalary(emp: Map[Int, Double]): Map[Int, Double] = emp.filter(slary => slary._2 > 35000 && (slary._2 * 0.75)>25000)

  def salaryIncrease(emp1: Map[Int, Double]): Map[Int, Double]= emp1.mapValues(value => if (value <= 20000) value * 2 else if (20001 < value && value <= 40000) value * 1.5 else value * 1.25)
}
*/
