package ChapterTwo;
import java.util.Scanner;

public class PairOdd {

	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		
		System.out.print("Give me value: ");
		int value =  scanner.nextInt();
		
		int res = value%2;
		
		if(res==0) {
			
			System.out.print(value + " is pair ");
			
		}else {
			
			System.out.print(value + " is odd ");
		}
		
	}
}
