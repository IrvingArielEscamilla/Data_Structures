package ChapterTwo;
import java.util.Scanner;

public class DemoSwitch {

	public static void main(String[] args) {

		Scanner scanner =  new Scanner(System.in);
		
		System.out.print("Choose a one day (1 - 7): ");
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
