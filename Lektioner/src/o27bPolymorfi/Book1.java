package o27bPolymorfi;
public class Book1 extends ReadingMatter
{
   private String author;
   
   public Book1 (String thisTitle, long isbnNum, String auth)
   {
      super(thisTitle,isbnNum);
      author = auth;
   }
   @Override
   public String toString()
   {
      return super.toString()+ "\t" + author;
   }
   @Override
   public void content()
   {
      super.content();
      System.out.println ("Author: " + author);
   }
}

