package o27bPolymorfi;

public class ReadingMatter {
	private String title;
	private long isbn;
	
	
	public ReadingMatter(String thisTitle, long isbnNum){
		title = thisTitle;
		isbn = isbnNum;
	}
	
	public String toString(){
		return title + "\t" + isbn;
	}
	
	public void content(){
		System.out.println("Title: " + title);
		System.out.println("ISBN: " + isbn);
	}
	
}
