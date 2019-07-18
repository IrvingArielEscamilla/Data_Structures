package ChapterTwo;
import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		
		int i = 1;
		
		while ( i<= number) {
			System.out.print(i + " ; ");
			i++;
		}
		
	}
}
