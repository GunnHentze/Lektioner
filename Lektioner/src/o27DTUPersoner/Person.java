package o27DTUPersoner;

public class Person {

	private String navn;
	
	public Person(String navn){
		this.navn = navn;
	}
	
	public String getNavn(){
		return navn;
	}
	
	public void setNavn(String navn){
		this.navn = navn;
	}
	
	public String toString(){
		String result = "class Person\n\t[navn="+getNavn()+"]";
		return result;
	}
}
