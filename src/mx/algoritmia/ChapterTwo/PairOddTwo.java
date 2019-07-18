package ChapterTwo;
import java.util.Scanner;

public class PairOddTwo {

	public static void main (String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		
		System.out.print("Give me value: ");
		int value =  scanner.nextInt();
		
		int res = value%2;
		
		String mssg = (res == 0) ? " is pair": " is odd";
		System.out.print(value + mssg ) ;
		
	}
}
