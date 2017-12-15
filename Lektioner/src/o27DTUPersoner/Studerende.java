package o27DTUPersoner;

public class Studerende extends Person {
	
	private String studienummer;
	
	public Studerende(String navn, String studienummer){
		super(navn);
		this.studienummer = studienummer;
	}
	
	public String getStudienummer(){
		return studienummer;
	}
	public void setStudienummer(String studienummer){
		this.studienummer = studienummer;
	}
	
	public String toString(){
		String result = "class Studerende\n\t[navn="+getNavn()+"]" +
						"\n\t[studienummer="+studienummer+"]";
		return result;
	}
	
}
