package spillekort;

public class Spil {
	private Kort[] kort;
	public Spil(){
		kort = new Kort[52];
		inispil();
	}
	
	private void inispil(){
		for(int i=0; i<13;i++){
			kort[i]= new Kort('S',i);
		}
		for(int i=13; i<26;i++){
			kort[i]= new Kort('H',i-13);
		}
		for(int i=26; i<39;i++){
			kort[i]= new Kort('K',i-26);
		}
		for(int i=39; i<52;i++){
			kort[i]= new Kort('R',i-39);
		}
	}
	
	public Kort traekkort(){
		Kort kort1 = kort[0];
		for(int i =0; i<kort.length-1;i++){
			kort[i] = kort[i+1];
		}
		kort[51] = kort1;
		return kort1;
	}
	
	public void blandkort(){
		Kort[] kort1 = new Kort[52];
		int i = 0;
		while(i < kort1.length) {
			int værdi =(int)(Math.random()*52);
			if(kort1[værdi]== null){
				kort1[værdi] = kort[i];
				i++;
			}
		}
		kort = kort1;		
	}
	
	public String toString(){
		String result = "";
		for(Kort val : kort){
			result += val+"\n";
		}
		return result;
	}
}
