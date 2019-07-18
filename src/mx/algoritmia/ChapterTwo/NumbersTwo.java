package ChapterTwo;
import java.util.Scanner;

public class NumbersTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		
		int i = 1;
		
		do {
			System.out.print(i+" ; 6");
			i++;
		}while ( i <= number);
	}

}
