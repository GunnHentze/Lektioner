
public class Transaction {

//	-------------------------------------------------------------

	   //  Creates some bank accounts and requests various services.

	   //-------------------------------------------------------------

	   public static void main (String[] args)

	   {                               					// anonymous object             
	      Account acct1 = new Account ("Ted Murphy", new Address("Lundsgade 3", "Koebenhavn OE", "DK", 2100) ,72354, 102.56);
	      Account acct2 = new Account ("Jane Smith", new Address("Hammerbakken 7", "Birkeroed", "DK", 3460),69713, 40.00);
	      Account acct3 = new Account ("Edward Demsey", new Address("Hovedgaden 8", "Hoersholm", "DK", 2970),93757, 759.32);

	      // Nu uden beløb
	      Account acct4 = new Account ("Joe Louis", new Address("Strandvaenget 7", "Rungsted", "DK", 2960), 12345);

	      acct1.deposit (25.85);


	      double smithBalance = acct2.deposit (500.00);

	      System.out.println ("Smith balance after deposit: " + smithBalance);

	      System.out.println ("Smith balance after withdrawal: " +  acct2.withdraw (430.75, 1.50));

	      acct3.withdraw (800.00, 0.0);  // exceeds balance


	      acct2.transfer(100.00, 1.50, acct3); //beløb,fee,til-account

	      acct2.transfer(100.00, 1.50, acct3); // Der er ikke dækning på kontoen


	      acct1.addInterest();

	      acct2.addInterest();

	      acct3.addInterest();


	      System.out.println ();

	      System.out.println (acct1);// beløb udskrives formatteret

	      System.out.println (acct2);

	      System.out.println (acct3);

	      System.out.println (acct4);

	   }



}
