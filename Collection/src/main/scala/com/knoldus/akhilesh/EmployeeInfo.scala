
package com.knoldus.akhilesh

class EmployeeInfo {

  def empDetail(emp: Map[Int, Double]): Map[Int, Double] = {
    val empD=emp.filter(slary => slary._2 > 35000 )
    empD
  }

  def reviseSalary(emp: Map[Int, Double]): Map[Int, Double] = {
    emp.mapValues {
      case salary if salary < 20000 => salary * 2
      case salary if salary >= 20001 && salary <= 40000 => salary * 1.5
      case salary if salary > 40001 => salary * 1.25
    }
  }



}
