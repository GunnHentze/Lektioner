package o27DTUPersoner;

public class Vip extends Ansat{
	private String[] kurser;

	public Vip(String navn, String institutnavn, String[] kurser) {
		super(navn, institutnavn);
		this.kurser = kurser;
	}

	public String[] getKurser() {
		return kurser;
	}

	public void setKurser(String[] kurser) {
		this.kurser = kurser;
	}

	public String toString(){
		String result = "class Vip\n\t[navn="+getNavn()+"]" +
				"\n\t[institutnavn="+getInstitutnavn()+"]";
		for(String str : kurser){
				result += "\n\t[kursus="+str+"]";
		}
		return result;
	}
	
}
