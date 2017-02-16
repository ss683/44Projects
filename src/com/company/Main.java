package com.company;

import java.io.*;

import java.util.*;

import java.text.*;

public class Main {

    public static void main(String[] args) {
	//Project Sorting BackAccount Objects
        NumberFormat formatter = NumberFormat.getNumberInstance( );

        formatter.setMinimumFractionDigits(2);

        formatter.setMaximumFractionDigits(2);



        String name;

        int j;
        BankAccount ba[] = new BankAccount[5];

        for(j =0; j < ba.length; j++)

        {

            Scanner kbReader = new Scanner(System.in);

            System.out.print("Please enter the name to whom the account belongs. ");

            name = kbReader.nextLine( );



            System.out.print("Please enter the amount of the deposit. ");

            double amount = kbReader.nextDouble( );

            System.out.println(" "); //gives a blank line between accounts

ba[j] = new BankAccount(name, amount);
            Comparable comp = new BA_comparable(); //it tells you to type this in here but it doesn't work.
        }
        Arrays.sort(ba, comp);
        for(j = 0; j < ba.length; j++)
        {
            System.out.println(ba[j].name + ">>>" + ba[j].balance);
        }


    }

}
