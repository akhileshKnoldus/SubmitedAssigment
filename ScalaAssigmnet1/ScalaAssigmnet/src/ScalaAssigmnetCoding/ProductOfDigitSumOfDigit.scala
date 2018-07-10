package ScalaAssigmnetCoding

class ProductOfDigitSumOfDigit {

 def productOfDigit(num:Int): Int={
   
   if(num ==1)
     return 1
   else
    return productOfDigit(num-1) * num;
 }

}

object  SumOfDigit{
  def main(args: Array[String]): Unit = {
    
   
    val productOfDigitSumOfDigit=new ProductOfDigitSumOfDigit()
    println(productOfDigitSumOfDigit.productOfDigit(5))
    val digit=productOfDigitSumOfDigit.productOfDigit(5)

    var temp=digit;
    var sum=0;
/*
    while (temp!=0){
      sum=sum+(temp%10);
      temp=temp/10;
    }*/

    def findSum(num:Int):Int={
      if(num/10< 1)
        (num%10)
        else{
        findSum(num/10)+(num%10)
      }
    }
    println(findSum(temp))

  }
}