package ChapterTwo;
import java.util.Scanner;

public class HelloName {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Name: ");
		String nom = scanner.nextLine();
		
		System.out.println("Hello ... " + nom);
	}

}
