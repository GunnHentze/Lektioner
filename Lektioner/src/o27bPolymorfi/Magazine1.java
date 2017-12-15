package o27bPolymorfi;

public class Magazine1 extends ReadingMatter
{
   private int weeknumber;
  
   public Magazine1 (String thisTitle, long isbnNum, int weeknumber1)
   {
      super(thisTitle, isbnNum);
      weeknumber = weeknumber1;
   }

   @Override
   public String toString()
   {      
      return super.toString() + "\t" + weeknumber;
   }

   @Override
   public void content()
   {
      super.content();
      System.out.println ("Weeknumber: " + weeknumber);
   }
}



