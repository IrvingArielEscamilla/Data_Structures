package ChapterTwo;
import java.util.Scanner;

public class DemoConstants {
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY= 6;
	public static final int SUNDAY = 7;
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a day in number(1-7): ");
		int value = scanner.nextInt();
		String day;
		
		switch(value) {
		
		case 1 :
			day = "Monday";
			break;
		case 2 :
			day = "Tuesday";
			break;
		case 3 :
			day = "Wednesday";
			break;
		case 4 :
			day = "Thursday";
			break;
		case 5 :
			day = "Friday";
			break;
		case 6 :
			day = "Saturday";
			break;
		case 7 :
			day = "Sunday";
			break;
			default:
				day ="Day incorrect... choose value as (1 or 7) ";
		
		}
		System.out.print(day);
	}
}
