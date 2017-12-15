
public class Car2 {
	private String maerke, nummerplade, farve;
	private int regno;
	private static int nextRegno = 1;
	
	public Car2(String maerke, String nummerplade, String farve){
		this.maerke = maerke;
		this.nummerplade = nummerplade;
		this.farve = farve;
		this.regno = Car2.nextRegno;
		Car2.nextRegno++;
		
	}
	public int getRegno(){
		return regno;
	}
	
	public void setBrand(String maerke){
		this.maerke = maerke;
	}
	
	public String getBrand(){
		return maerke;
	}
	
	public void setLicenseplate(String nummerplade){
		this.nummerplade = nummerplade;
	}
	public String getLicenseplate(){
		return nummerplade;
	}
	
	public void setColor(String farve){
		this.farve = farve;
	}
	
	public String getColor(){
		return farve;
	}
	
	public static int getNextRegno(){
		return nextRegno;
	}
	
	public String toString(){
		String result = "[" + nummerplade + "] " + farve + " " + maerke;
		return result;
	}
	
	public boolean equals(Car2 otherCar){
		if(nummerplade.equals(otherCar.nummerplade))
			return true;
		else return false;
	}
	
	public boolean alike(Car2 otherCar){
		if(maerke.equals(otherCar.maerke) && farve.equals(otherCar.farve))
			return true;
		else return false;
	}
	
	
	
}
