package ChapterTwo;
import java.util.Scanner;

public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter value: (0 => end) :");
		int value = scanner.nextInt();
		
		int i=0;
		
		while(value!=0 && i<10) {
			arr[i++] = value;
			
			System.out.print("Enter the next value: ");
			value = scanner.nextInt();
			
		}
		
		for(int j=0; j<i ; j++) {
			System.out.print(arr[j]);
		}
	}

}
