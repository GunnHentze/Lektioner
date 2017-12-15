import java.util.*;


public class O06Sekunder {
	final 
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int secInMin = 60;
		int secInHour = secInMin*60;
		int secInDay = secInHour * 24;
		int restSeconds, day, hour, min;
		
		int totalSeconds = scanner.nextInt();
		day = totalSeconds/secInDay;
		restSeconds = totalSeconds-day*secInDay;
		hour = restSeconds/secInHour;
		restSeconds = restSeconds - hour*secInHour;
		min = restSeconds/secInMin;
		restSeconds = restSeconds - min*secInMin;
		
		System.out.print(totalSeconds + " seconds equals " + day + " days, "+ hour + " hours, " + min + " minutes and " + restSeconds+" seconds." );
		
		
		
		
		scanner.close();
	}
}
