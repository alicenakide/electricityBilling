package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//    Java program to calculate electricity using the static method with outputs

        int units;
        double billPay = 0;

//    Java code for obtaining Electricity Bill taking inputs through scanner class, with outputs.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of units: ");

        units= sc.nextInt();


        if(units<100)
        {
            billPay = units *1.20;
        }
        else if (units<300){
            billPay = 100 * 1.20 + (units-100)*2;
        }
        else if (units>300)
        {
            billPay = 100 *1.20+200*2+(units -300)*3;
        }
        System.out.println("Bill to pay  : " + billPay);
    }


}
