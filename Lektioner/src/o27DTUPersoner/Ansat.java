package o27DTUPersoner;

public class Ansat extends Person{
	
	private String institutnavn;

	public Ansat(String navn, String institutnavn) {
		super(navn);
		this.institutnavn = institutnavn;
	}
	
	public String getInstitutnavn(){
		return institutnavn;
	}
	
	public void setInstitutnavn(String institutnavn){
		this.institutnavn = institutnavn;
	}
	
	@Override
	public String toString(){
		String result = "class Ansat\n\t[navn="+getNavn()+"]" + "\n\t[institutnavn="+getInstitutnavn()+"]";
		return result;
	}
}
