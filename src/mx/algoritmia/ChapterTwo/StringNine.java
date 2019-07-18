package ChapterTwo;

import java.util.Scanner;

//Use a method equal to compare strings;
public class StringNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scanner =  new Scanner(System.in);
		System.out.println("String one: ");
		String s1 = scanner.next();
		
		System.out.println("String two: ");
		String s2 = scanner.next();
		
		System.out.println("String one : [ " + s1 + "]");
		System.out.println("String two : [ " + s2 + "]");
		
		if(s1.equals(s2)) {
			System.out.print("Are equals");
		}else {
			System.out.print("Are different");
		}
	}

}
