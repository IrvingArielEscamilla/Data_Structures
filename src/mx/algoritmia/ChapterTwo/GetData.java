package ChapterTwo;
import java.util.Scanner; 

public class GetData {

	public static void main (String[] args) {
		
		Scanner  scanner = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name  = scanner.nextLine();
		
		System.out.print("Age: ");
		int age = scanner.nextInt();
		
		System.out.print("Height: ");
		double height = scanner.nextDouble();
		
		String  viewData ="";
		
		viewData += "My names is " + name + " and I have " + age + " years old \n";
		viewData += "Mi height is: " + height +" meters";
		
		System.out.print(viewData);
		
	}
}
