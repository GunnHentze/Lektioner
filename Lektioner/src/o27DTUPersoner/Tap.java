package o27DTUPersoner;

public class Tap extends Ansat {
	private int arbejdstid;

	public Tap(String navn, String institutnavn, int arbejdstid) {
		super(navn, institutnavn);
		this.arbejdstid = arbejdstid;
	}
	
	@Override
	public String toString(){
		String result = "class Tap\n\t[navn="+getNavn()+"]" +
				"\n\t[institutnavn="+getInstitutnavn()+"]" + 
				"\n\t[arbejdstid="+arbejdstid+"]";
		return result;
	}
}
