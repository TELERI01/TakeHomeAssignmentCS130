package Chapter4;

import java.util.*;

public class DaySwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num1 = scan.nextInt();
		
		if(num1>-10 && num1<100) {
			System.out.println("It is a two digit number");
			
		}
		else if(num1>-100 && num1<1000)
			System.out.println("It is a three digit number");
		else if(num1>-1000 && num1<10000)
			System.out.println("It is a four digit number");
		else if(num1>-10000 && num1<100000)
			System.out.println("It is a five digit number");
		else
			System.out.println("This number is not between 1 && 99999");
		

	}

}
