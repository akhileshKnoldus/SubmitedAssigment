package com.knoldus.akhilesh.currencycalculator.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.knoldus.akhilesh.currencycalculator.aviliableCurrency.CurrencyName;

public class Test {

    static String to = "";
    static String from = "";
    static int amt;
    static Scanner sc = new Scanner(System.in);


    static void toInput() {
        System.out.println("Enter Currency To");
        try {
            to = sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Pls Enter the avilibel cuurency and Confirm spelling of currency is according to mention Currency  ");
            toInput();
        }

    }

    static void fromInput() {


        System.out.println("Converted Currency from");
        try {
            from = sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Pls Enter the avilibel cuurency and Confirm spelling of currency is according to mention Currency  ");

            fromInput();
        }


    }

    static void getAmount() {
        try {
            System.out.println("Enter Ammount");
            sc.nextLine();
            amt = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Pls Enter Numeric Value");
            getAmount();
            // TODO: handle exception
        }
    }

    public static void main(String[] args) {

        CurrencyName currencyName = new CurrencyName();
        currencyName.aviliableCurrency();
        toInput();
        fromInput();
        getAmount();
        currencyName.getCurrencyInformation(to, from, amt);


    }

}
