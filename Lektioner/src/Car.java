
public class Car {
	private String maerke, nummerplade, farve;
	
	public Car(String maerke, String nummerplade, String farve){
		this.maerke = maerke;
		this.nummerplade = nummerplade;
		this.farve = farve;
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
	
	
	public String toString(){
		String result = "[" + nummerplade + "] " + farve + " " + maerke;
		return result;
	}
	
	public boolean equals(Car otherCar){
		if(nummerplade.equals(otherCar.nummerplade))
			return true;
		else return false;
	}
	
	public boolean alike(Car otherCar){
		if(maerke.equals(otherCar.maerke) && farve.equals(otherCar.farve))
			return true;
		else return false;
	}
	
	
	
}
