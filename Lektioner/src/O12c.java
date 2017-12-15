
public class O12c {
	public static void main(String[] args){
		final int STOP = 10;
		int i;
		/*for(i=1; i<STOP; i++){
			System.out.println("i har nu værdien " + i);
		}*/
		i=1;
		/*do{
			System.out.println("i har nu værdien " + i);
			i++;
		}while(i<STOP);*/
		
		i=1;
		while(i<STOP){
			System.out.println("i har nu værdien " + i);
			i++;
		}
		
		
		/* Hvis STOP ændres til 1, så vil for løkken og while
		 * ikke printe noget, mens do while løkken vil printe 1 gang, for værdien 1.
		 */
	}
}
