package core.java;
import java.util.Scanner;
public class GradePoint {
	public static void main(String[] args) throws Throwable {
		Thread.sleep(1000);
		Scanner scan = new Scanner(System.in);	   Scanner input = new Scanner(System.in); 
		System.out.println("put any number");
		//Scanner input = new Scanner(System.in);

		String initial = "";  initial=scan.nextLine();
	
	if (initial.equalsIgnoreCase("Pi") )    try {    { System.out.println("Please put Pijush's score:");	
	int num = input.nextInt();    System.out.println(" Pijush's grade is: " );    if (num>100)  System.out.println("Please score in between 0 to 100");  
	else if (num>=91 && num<=100)  System.out.println("Grade is A+");	   else if (num>=81 && num<90)  System.out.println("Grade is A");  
	else if (num>=71 && num<80)  System.out.println("Grade is B");    else if (num>=61 && num<70)  System.out.println("Grade is C"); 	
	else if (num>=50 && num<60)  System.out.println("Grade is D");    else if (num>=0 && num<50)	 System.out.println("Fail");
	else if (num<0)  System.out.println("You have put a negetive number!");  }
	}catch(Exception ex)		{System.out.println("That's not a whole number!"); }
	//That's all for this group's grade
	else System.out.println("Not your student!");
	if (initial.equalsIgnoreCase("L") )    try {    { System.out.println("Please put Luva's score:");        //2nd condition integer	
	int num = input.nextInt();    System.out.println(" Luva's " );    if (num>100)  System.out.println("score can't be more than 100!");  
	else if (num>=91 && num<=100)  System.out.println("Grade is A+");	   else if (num>=81 && num<90)  System.out.println("Grade is A");  
	else if (num>=71 && num<80)  System.out.println("Grade is B");    else if (num>=61 && num<70)  System.out.println("Grade is C"); 	
	else if (num>=50 && num<60)  System.out.println("Grade is D");    else if (num>=0 && num<50)	 System.out.println("Fail");
	else if (num<0)  System.out.println("score is not valid, You have put a negetive number!");  }        //to get rid of negetive number
	}catch(Exception ex)		{System.out.println("That's not a whole number!"); }        //to get rid of fraction
	//Prince
	
	
	
	}
}
