package ChapterTwo;
import java.util.Scanner;

public class StringSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Give me a number type integer: ");
		int value = scanner.nextInt();
		
		System.out.println("Value: " + value);
		System.out.println("Boolean: " + Integer.toBinaryString(value));
		System.out.println("Octal: " + Integer.toOctalString(value));
		System.out.println("Hex: " + Integer.toHexString(value));
		
		System.out.println("Numeric Base: ");
		int base = scanner.nextInt();
		
		String sBaseN = Integer.toString(value,base);
		System.out.println(value + "in base:("+base+")= " + sBaseN);
	}

}
