package mybkg;

import java.util.Scanner;

public class classy {

	public static void main(String[] args) {
		
		 
		System.out.println("Enter First Number");
		Scanner input = new Scanner(System. in);
		int x= input. nextInt();
		System.out.println("You entered " + x);
		
		System.out.println("Enter Second Number");
		Scanner input2 = new Scanner(System. in);
		int y = input2. nextInt();
		System.out.println("You entered " + y);
		

		int z=x+y;
		System.out.println("The Sum is = "+z);
		
	}

}
