package com.knoldus.akhilesh.currencycalculator.aviliableCurrency;

public class CurrencyName {
    public CurrencyName(){

        System.out.println("Cuurency Convertor App");
        System.out.println("--------------------------------------------------");

    }

   public void aviliableCurrency(){

        System.out.println("Dollars");
        System.out.println("Euro");
        System.out.println("IndianRupies");
        System.out.println("Pound");
        System.out.println("YEN");
       System.out.println("------------------------------------------------------");
    }



    public static void getCurrencyInformation(String to,String from , int amount) {
        to=to.toLowerCase();

        from=from.toLowerCase();
        amount=amount;


        if(amount<0){
            System.out.println("Please Enter positive amount");
            getCurrencyInformation(to,from,amount);
        }else {
 
        /*	System.out.println("Enter in else condition");
        	System.out.println(to+"__________________"+from);
*/
            if (to.equals(to) && from.equals( from) ){


                to = String.valueOf(amount * 1);
                System.out.println("Converted Amount="+to);
            }


          else  if (to.equals("dollars")&& from.equals("euro")) {
                to = String.valueOf(amount * .85);
                System.out.println("Converted Amount="+to);
            }


            else if (to.equals("dollars") && from.equals("indianrupies")) {

                to = String.valueOf(amount * 68.77);


                System.out.println("Converted Amount="+to);

            }


            else if (to.equals("dollars")&& from.equals("pound")) {
                to = String.valueOf(amount * .75);
                System.out.println("Converted Amount="+to);
            }

            else if (to.equals("dollars") && from.equals( "yen")) {
                to = String.valueOf(amount * 110.47);
                System.out.println("Converted Amount="+to);
            }


           /* else if (to.equals("euro")&& from.equals( "euro")) {
                to = String.valueOf(amount * 1);
                System.out.println("Converted Amount="+to);
            }
*/
            else if (to.equals("euro") && from.equals("dollars")){
                to = String.valueOf(amount * 1.18);
                System.out.println("Converted Amount="+to);
            }


            else if (to.equals("euro")&& from .equals("indianrupies")) {
                to = String.valueOf(amount * 80.83);
                System.out.println("Converted Amount="+to);
            }


            else if (to .equals("euro") && from.equals( "pound")) {

                to = String.valueOf(amount * .88);
                System.out.println("Converted Amount="+to);
            }


            else if (to.equals("euro")&& from.equals("yen")) {
                to = String.valueOf(amount * 129.86);
                System.out.println("Converted Amount="+to);

            }




            else if (to .equals("indianrupies") && from.equals("euro") ){
                to = String.valueOf(amount * .012);
                System.out.println("Converted Amount="+to);

            }

            else if (to .equals("indianrupies") && from.equals( "dollars")) {
                to = String.valueOf(amount * .015);
                System.out.println("Converted Amount="+to);
            }


//            else if (to.equals("indianrupies") && from.equals("indianRupies")) {
//                to = String.valueOf(amount);
//                System.out.println("Converted Amount="+to);
//            }


            else if (to.equals("indianrupies") && from.equals("pound") ){
                to = String.valueOf(amount * .011);
                System.out.println("Converted Amount="+to);
            }


            else if (to.equals("indianrupies")&& from .equals( "yen")) {
                to = String.valueOf(amount * 1.61);
                System.out.println("Converted Amount="+to);
            }

            //

            else if (to .equals("pound") && from.equals("euro")) {
                to = String.valueOf(amount * 1.13);
                System.out.println("Converted Amount="+to);

            }

            else if (to .equals("pound") && from.equals("dollars")) {
                to = String.valueOf(amount * 1.13);
                System.out.println("Converted Amount="+to);
            }


            else if (to.equals("pound")&& from.equals( "indianrupies")) {
                to = String.valueOf(amount * 91.37);
                System.out.println("Converted Amount="+to);
            }


         /*   else if (to.equals("pound")&& from.equals( "pound")) {

                to = String.valueOf(amount);
                System.out.println("Converted Amount="+to);
            }
*/

            else  if (to.equals("pound") && from.equals("yen")) {
                to = String.valueOf(amount * 146.77);
                System.out.println("Converted Amount="+to);
            }


            else if (to.equals("yen")&& from.equals("euro")) {
                to = String.valueOf(amount * 0.007);
                System.out.println("Converted Amount="+to);
            }

            else if (to.equals("yen")&& from.equals("dollars")) {
                to = String.valueOf(amount * 0.0091);
                System.out.println("Converted Amount="+to);
            }


            else if (to .equals("yen") && from.equals("indianrupies")) {
                to = String.valueOf(amount * 0.62);
                System.out.println("Converted Amount="+to);
            }


            else if (to.equals("yen")&& from.equals( "pound")) {

                to = String.valueOf(amount * 0.068);
                System.out.println("Converted Amount="+to);
            }

/*
            else if (to.equals("yen") && from .equals("yen") ){
                to = String.valueOf(amount * 1);
                System.out.println("Converted Amount="+to);
            }*/
            else{
                System.out.println("Pls Enter the according to aviliable Currency");
            }

        }
    }








}
