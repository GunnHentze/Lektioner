//********************************************************************
//  Account.java       Author: Lewis/Loftus+Klaus Elk +(Gunnar Johansen)
//  2002-09-30
//  Represents a bank account with basic services such as deposit,
//  withdraw and transfer.
//********************************************************************

// Der bruges objekter fra klassen Address

import java.text.NumberFormat; // afsnit 2.9

 public class Account
{
   private NumberFormat fmt = NumberFormat.getCurrencyInstance();

   private final double RATE = 0.035;  // interest rate of 3.5%

   private long acctNumber;
   private double balance;
   private String name;
   private Address address;

 

   //-----------------------------------------------------------------
   //  Sets up the account by defining its owner, account number,
   //  and initial balance.
   //-----------------------------------------------------------------

   public Account (String owner, Address address, long account, double initial)
   {
      name = owner;
      acctNumber = account;
      balance = initial;
      this.address = address;
   }

   // Ny konstruktør uden startbeløb

   public Account (String name, Address address, long acctNumber)
   {
      this.name = name;
      this.acctNumber = acctNumber;
      this.balance = 0.0;
      this.address = address;

      // Use the work done already and future updates that may come...
      // Objektet referer til sig selv med 'this'
      // this(name,address, acctNumbeer, 0.0); //Dette er meget kortere

   }

   //-----------------------------------------------------------------
   //  Validates the transaction, then deposits the specified amount
   //  into the account. Returns the new balance.
   //-----------------------------------------------------------------

   public double deposit (double amount)
   {
      if (amount < 0)  // deposit value is negative
      {
         System.out.println ();
         System.out.println ("Error: Deposit amount is invalid.");
         System.out.println (acctNumber + "  " + fmt.format(amount));
      }
      else
         balance = balance + amount;


      return balance;

   }


   //-----------------------------------------------------------------
   //  Validates the transaction, then withdraws the specified amount
   //  from the account. Returns the new balance.
   //-----------------------------------------------------------------

   public double withdraw (double amount, double fee)
   {
      amount += fee;


      if (amount < 0)  // withdraw value is negative
      {
         System.out.println ();
         System.out.println ("Error: Withdraw amount is invalid.");
         System.out.println ("Account: " + acctNumber);
         System.out.println ("Requested: " + fmt.format(amount));
      }
      else
         if (amount > balance)  // withdraw value exceeds balance
         {
            System.out.println ();
            System.out.println ("Error: Insufficient funds.");
            System.out.println ("Account: " + acctNumber);
            System.out.println ("Requested: " + fmt.format(amount));
            System.out.println ("Available: " + fmt.format(balance));
         }
         else
            balance = balance - amount;


      return balance;

   }
   

// -------------------------------------------------------------

   public double transfer(double amount, double fee, Account to)
   {
      double oldBalance = balance;
   

      withdraw(amount, fee); // returnerer ny balance,hvis det går godt
                             // returnerer gl. balance,hvis det ikke går godt

   

      //We can only do the transfer if it was legal to withdraw
      //there is no errorcode in withdraw function - so test balance

      if (balance < oldBalance) //dvs. der er trukket på kontoen
         to.deposit(amount);
      // else er overflødig, da der kommer en udskrift fra metoden withdraw
    

      return balance;

   }

 

   //-----------------------------------------------------------------
   //  Adds interest to the account and returns the new balance.
   //-----------------------------------------------------------------

   public double addInterest ()
   {
      balance += (balance * RATE);
      return balance;
   }

 

   //-----------------------------------------------------------------
   //  Returns the current balance of the account.
   //-----------------------------------------------------------------

   public double getBalance ()
   {
      return balance;
   }

 

   //-----------------------------------------------------------------
   //  Returns the account number.
   //-----------------------------------------------------------------

   public long getAccountNumber ()
   {
      return acctNumber;
   }

 

   //-----------------------------------------------------------------
   //  Returns a one-line description of the account as a string.
   //-----------------------------------------------------------------

   public String toString ()
   {
      return (acctNumber + "\t" + name + "\t" + address + "\t" + fmt.format(balance));
   }

} 


