
public class O03Skat2 {
	public static void main(String[] args){
		int indkomst = 120000;
		double ambi, pension, bundskat;
		
		ambi = indkomst * 8.0 / 100.0;
		pension = indkomst * 1.0 / 100.0;
		bundskat = (indkomst - ambi - pension - 33400.0) * 7.0 / 100;
		
		System.out.print("Arbejdsmarkedsbidrag: ");
		System.out.println(ambi);
		System.out.print("S�rlig pensionsopsparing: ");
		System.out.println(pension);
		System.out.print("Bundskat: ");
		System.out.print(bundskat);
	}
}
