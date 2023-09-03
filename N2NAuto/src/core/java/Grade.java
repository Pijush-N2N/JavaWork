package core.java;
import java.util.Scanner;
public class Grade {

	public static void main(String[] args) throws InterruptedException {       						  //Throws wait
        //using scanner class 	
		Scanner scan = new Scanner(System.in);	     Scanner input = new Scanner(System.in);      	  //Scanner class for string & integer
		System.out.println("  Good Afternoon!");
		System.out.println(" Would you like to grade your students?");    Thread.sleep(1000);         //1 sec of wait
		System.err.println(" Please enter L for Luva, Pr for Prince, Si for Shikot, R for Rasel, Sh for Shazzad, U for Ullah & Pi for Pijush..");
		//starting input
		String initial = "";  initial=scan.nextLine();     										      //String input 
		//Luva
		if (initial.equalsIgnoreCase("L") )	    		try {  		  { System.out.println("Please put Luva's score:");        //2nd condition int	
		int num = input.nextInt();     System.out.println(" Luva's " );       if (num>100)  System.out.println("score can't be more than 100!");  
		else if (num>=91 && num<=100)  System.out.println("Grade is A+");	  else if (num>=81 && num<90)    System.out.println("Grade is A");  
		else if (num>=71 && num<80)    System.out.println("Grade is B");      else if (num>=61 && num<70)    System.out.println("Grade is C"); 	
		else if (num>=50 && num<60)    System.out.println("Grade is D");      else if (num>=0 && num<50)	 System.out.println("Fail");
		else if (num<0) 	 System.out.println("score is not valid, You have put a negetive number!");  }        //to get rid of negetive number
		}catch(Exception ex)		  {System.out.println("That's not a whole number!"); }     				      //to get rid of fraction
		//Prince
		else if (initial.equalsIgnoreCase("pr") )   	 try {   	 { System.out.println("Please put Prince's score:");	
		int num = input.nextInt();     System.out.println(" Prince's " );     if (num>100)  System.out.println("score can't be more than 100!");  
		else if (num>=91 && num<=100)  System.out.println("Grade is A+");	  else if (num>=81 && num<90)    System.out.println("Grade is A");  
		else if (num>=71 && num<80)    System.out.println("Grade is B");      else if (num>=61 && num<70)    System.out.println("Grade is C"); 	
		else if (num>=50 && num<60)    System.out.println("Grade is D");      else if (num>=0 && num<50)	 System.out.println("Fail");
		else if (num<0) 	 System.out.println("score is not valid, You have put a negetive number!");  }
		}catch(Exception ex)		  {System.out.println("That's not a whole number!"); }
		//Shikot
		else if (initial.equalsIgnoreCase("Si") )   	 try { 		   { System.out.println("Please put Shikot's score:");	
		int num = input.nextInt();     System.out.println(" Shikot's " );     if (num>100)  System.out.println("score can't be more than 100!");  
		else if (num>=91 && num<=100)  System.out.println("Grade is A+");	  else if (num>=81 && num<90)    System.out.println("Grade is A");  
		else if (num>=71 && num<80)    System.out.println("Grade is B");      else if (num>=61 && num<70)    System.out.println("Grade is C"); 	
		else if (num>=50 && num<60)    System.out.println("Grade is D");      else if (num>=0 && num<50)	 System.out.println("Fail");
		else if (num<0)  	System.out.println("score is not valid, You have put a negetive number!");  }
		}catch(Exception ex)		  {System.out.println("That's not a whole number!"); }
		//Rasel
		else if (initial.equalsIgnoreCase("R") )  		  try { 	   { System.out.println("Please put Rasel's score:");	
		int num = input.nextInt();     System.out.println(" Rasel's " );      if (num>100)  System.out.println("score can't be more than 100!");  
		else if (num>=91 && num<=100)  System.out.println("Grade is A+");	  else if (num>=81 && num<90)    System.out.println("Grade is A");  
		else if (num>=71 && num<80)    System.out.println("Grade is B");      else if (num>=61 && num<70)    System.out.println("Grade is C"); 	
		else if (num>=50 && num<60)    System.out.println("Grade is D");      else if (num>=0 && num<50)	 System.out.println("Fail");
		else if (num<0)  	System.out.println("score is not valid, You have put a negetive number!");  }
		}catch(Exception ex)		  {System.out.println("That's not a whole number!"); }
		//Shazzed
		else if (initial.equalsIgnoreCase("Sh") )  		  try { 	   { System.out.println("Please put Shazzed's score:");	
		int num = input.nextInt();     System.out.println(" Shazzed's " );    if (num>100)  System.out.println("score can't be more than 100!");  
		else if (num>=91 && num<=100)  System.out.println("Grade is A+");	  else if (num>=81 && num<90)    System.out.println("Grade is A");  
		else if (num>=71 && num<80)    System.out.println("Grade is B");      else if (num>=61 && num<70)    System.out.println("Grade is C"); 	
		else if (num>=50 && num<60)    System.out.println("Grade is D");      else if (num>=0 && num<50)	 System.out.println("Fail");
		else if (num<0)  	System.out.println("score is not valid, You have put a negetive number!");  }
		}catch(Exception ex)		  {System.out.println("That's not a whole number!"); }
		//Ullah
		else if (initial.equalsIgnoreCase("U") )  		  try { 	   { System.out.println("Please put Ullah's score:");	
		int num = input.nextInt();     System.out.println(" Ullah's " );      if (num>100)  System.out.println("score can't be more than 100!");  
		else if (num>=91 && num<=100)  System.out.println("Grade is A+");	  else if (num>=81 && num<90)    System.out.println("Grade is A");  
		else if (num>=71 && num<80)    System.out.println("Grade is B");      else if (num>=61 && num<70)    System.out.println("Grade is C"); 	
		else if (num>=50 && num<60)    System.out.println("Grade is D");      else if (num>=0 && num<50)	 System.out.println("Fail");
		else if (num<0)  	System.out.println("score is not valid, You have put a negetive number!");  }
		}catch(Exception ex)		  {System.out.println("That's not a whole number!"); }
		//Pijush
		else if (initial.equalsIgnoreCase("Pi") )  		  try { 	   { System.out.println("Please put Pijush's score:");	
		int num = input.nextInt();     System.out.println(" Pijush's  " );    if (num>100)  System.out.println("score can't be more than 100!");  
		else if (num>=91 && num<=100)  System.out.println("Grade is A+");	  else if (num>=81 && num<90)    System.out.println("Grade is A");  
		else if (num>=71 && num<80)    System.out.println("Grade is B");      else if (num>=61 && num<70)    System.out.println("Grade is C"); 	
		else if (num>=50 && num<60)    System.out.println("Grade is D");      else if (num>=0 && num<50)	 System.out.println("Fail");
		else if (num<0)  	System.out.println("score is not valid, You have put a negetive number!");  }
		}catch(Exception ex)		  {System.out.println("That's not a whole number!"); }
		//That's all for this group's grade
		else System.out.println("Not your student!");        Thread.sleep(1200);
		System.err.println("Thank you for your input!");
		}}
