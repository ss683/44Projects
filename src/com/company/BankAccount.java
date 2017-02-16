package com.company;

/**
 * Created by Shane on 2/16/2017.
 */
public class BankAccount implements Comparable

{

    public BankAccount(String nm, double bal) //Constructor

    {

        name = nm;

        balance = bal;

    }

    public int compareTo(Object otherObject)

    {

        //otherObject is passed in as an Object type so let’s convert it into

//a BankAccount type object.

        BankAccount otherAccount = (BankAccount) otherObject;

        int retValue;

        if (balance < otherAccount.balance) //for Alphabetically, do (name < otherAccount.name)

        {

            retValue = -1;

        }

        else

        {

            if (balance > otherAccount.balance) //for Alphabetically, do (name > otherAccount.name)

            {

                retValue = 1;

            }

            else

            {

                retValue = 0;

            }

        }

        return retValue;

    }

    public String name;

    public double balance;

}

/*for the Comparator Project
public class BankAccount

{

    public BankAccount(String nm, double bal) //Constructor

    {

        name = nm;

        balance = bal;

    }
    BankAccount ary[] = new BackAccount[5];
    ary[0] = new BankAccount(128);
    ary[1] = new BankAccount(22);
    BankAccount ba1 = (BackAccount) first;
    Comparator comp = new Comparator(ary[0], ary[1]);
    Arrays.sort(ary, comp);


    public String name;

    public double balance;

}
 */