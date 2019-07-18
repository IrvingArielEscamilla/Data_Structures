package ChapterTwo;
import java.util.Scanner;

public class NumbersThree {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		
		int number = scanner.nextInt();		
		
		
		for(int i=1; i<=number; i++) {
			System.out.print(i + " ; ");
		}
	}
}
