package ScalaAssigmnetCoding

class BankAccount {

  private var balance=0;



  def deposite(amt:Int): Unit ={
    balance=balance+amt;
    println("Deposite Ammount Is ="+balance)

  }


  def withdraw(amt:Int): Unit ={

    if(balance>amt){
      balance=balance-amt;
      println("Your amount is withdraw sucessFull Remaning balance is="+balance)
    }else{
      println("Your balance is low Pls Check Your balance")
    }

  }
}

object  BankDemo{
  def main(args: Array[String]): Unit = {
    var bankAccount=new BankAccount()
    bankAccount.deposite(1000)
    bankAccount.withdraw(500)
  }
}