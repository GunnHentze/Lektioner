import java.util.Scanner;

public class O11Datoer {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int year, month, day, daysinmonth=0, dayafter, monthafter, yearafter;
		
		boolean leapYear;
		System.out.print("Indtast år: ");
		year = sc.nextInt();
		
		if(year%4 == 0){
			if(year %100 == 0){
				if(year %400 == 0)
					leapYear = true;
				else leapYear = false;
			}
			else leapYear = true;
		}
		else leapYear = false;
		
		
		System.out.print("Indtast måned: ");
		month = sc.nextInt();
		
		switch (month){
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			daysinmonth = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			daysinmonth = 30;
			break;
		case 2:
			daysinmonth= 28;
			break;
		}
		if(leapYear && month == 2){
			daysinmonth = 29;
		}
		
		System.out.print("Indtast dag: ");
		day = sc.nextInt();
		if(day>daysinmonth || day<1 || month<1 || month >12){
			System.out.println("Ugyldig dato");
			sc.close();
			return;
		}
		
		if(day == daysinmonth){
			dayafter =1;
			monthafter = month + 1;
			if(monthafter == 13){
				monthafter = 1;
				yearafter = year+1;
			}
			else yearafter = year;
		}
		else{
			yearafter=year;
			monthafter = month;
			dayafter= day+1;
		}
		
		System.out.print("Dagen efter "+day+"/"+month+" "+year+" er "+dayafter+"/"+monthafter+" "+yearafter);
		
		sc.close();
	}
}
