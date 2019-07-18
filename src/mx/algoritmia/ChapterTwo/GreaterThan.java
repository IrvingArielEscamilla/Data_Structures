package ChapterTwo;
import java.util.Scanner;

public class GreaterThan {

	public static void main (String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		
		System.out.print("Age: ");
		int age = scanner.nextInt();
		
		if(age >= 21) {
			
			System.out.println("Adult");
			
		}else {
			
			System.out.println("No adult");
		}
	}
}
