package ChapterTwo;
import java.util.Scanner;
//never use to compare String, it's a example .
public class StringEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =  new Scanner(System.in);
		System.out.println("String one: ");
		String s1 = scanner.next();
		
		System.out.println("String two: ");
		String s2 = scanner.next();
		
		System.out.println("String one : [ " + s1 + "]");
		System.out.println("String two : [ " + s2 + "]");
		
		if(s1 == s2) {
			System.out.print("Are equals");
		}else {
			System.out.print("Are different");
		}

	}

}
