package core.java;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		try {
			Thread.sleep(1000);
		System.out.println("put any number");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt(); 
	if (num>100)  System.out.println("Please score in between 0 to 100");  
	else if (num>=91 && num<=100)  System.out.println("Grade is A+");	
	else if (num>=81 && num<90)  System.out.println("Grade is A");  
	else if (num>=71 && num<80)  System.out.println("Grade is B");
	else if (num>=61 && num<70)  System.out.println("Grade is C"); 	
	else if (num>=50 && num<60)  System.out.println("Grade is D");
	else if (num>=0 && num<50)	 System.out.println("Fail");
	else if (num<0)  System.out.println("You have put a negetive number!");
			
	}catch(Exception ex)
		{System.out.println("That's not a whole number!");
	}
	
	
	}

}
