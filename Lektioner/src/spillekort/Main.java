package spillekort;

public class Main {
	public static void main(String[] args) {
		Spil spil = new Spil();	
		System.out.println(spil);
		spil.blandkort();
		System.out.println(spil);
		System.out.println("Træk et kort");	
		System.out.println("Du trak " +spil.traekkort());
	}
}
