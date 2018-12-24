package com.company;

import java.util.Scanner;

public class inputBill {


//    Java code for obtaining Electricity Bill taking inputs through scanner class, with outputs.

    public static void inputBill(){

        long units;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of units: ");

        units= sc.nextLong();

        double billPay =0;

        if (units<300){

            billPay=units*1.20;
        }

        else if (units<300){
            billPay=100*1.20+200*2+(units-300)*3;
        }

        System.out.println("Bill to pay : " + billPay);
    }
}
