package dato;

public class Dato {
	private int y;
	private int m;
	private int d;
	
	public Dato(int year, int month, int day){
		y = year;
		m = month;
		d = day;
	}
	
	public String danish(){
		String danish = d+"/"+m+"-"+y;
		return danish;
	}
	
	public String danishText(){
		String out;
		switch(m){
		case 1: out = "Januar"; break;
		case 2: out = "Februar"; break;
		case 3: out = "Marts"; break;
		case 4: out = "April"; break;
		case 5: out = "Maj"; break;
		case 6: out = "Juni"; break;
		case 7: out = "Juli"; break;
		case 8: out = "August"; break;
		case 9: out = "September"; break;
		case 10: out = "Oktober"; break;
		case 11: out = "November"; break;
		case 12: out = "Desember"; break;
		default: out = "Kender ikke denne måned";
		}
		
		String text = d +". "+out+" "+y;
		return text;
	}
	
	public String iso(){
		String mo, is,di;
		if(m<10){
			if(d<10){
				di = "0" + d;
				mo = "0"+m;
				is = y+"-"+mo+"-"+di;
			}
			else{
				mo = "0"+m;
				is = y+"-"+mo+"-"+d;
			}
		}
		else {
			if(d<10){
				di = "0" + d;
				is = y+"-"+m+"-"+di;
			}
			else
				is = y+"-"+m+"d";
		}
		return is;
	}
	
}
