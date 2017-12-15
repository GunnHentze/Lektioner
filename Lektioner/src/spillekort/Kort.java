package spillekort;

public class Kort {
	private char farve; //S,H,R,K
	private int vaerdi; // 0 til 12
	
	public Kort (char farve, int vaerdi){
		this.farve = farve;
		this.vaerdi = vaerdi;
	}
	
	public String toString(){
		String result = farve +" "+ vaerdi;
		return result;
	}
}
