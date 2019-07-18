package ChapterTwo;
import java.util.Scanner;

public class DemoArrayTwo {

	public static void main(String[] args) {

		String days[] = {"Monday", "Tuesday", "Wednesday","Thursday","Friday","Saturday", "Sunday"};
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a day (1-7): ");
		int value = scanner.nextInt();
		
		if(value <=days.length) {
			System.out.print(days[value-1]);
		}else {
			System.out.print("Incorrect day...");
		}
		
	}

}
