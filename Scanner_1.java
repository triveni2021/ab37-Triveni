package Variables;

import java.util.Scanner;

public class Scanner_1 {
	
	public static void main(String[] args) {
		
	 Scanner s = new Scanner(System.in);
	 System.out.println("Enter the value of a:");
	  int a = s.nextInt();
	  System.out.println(" the value of a is:" +a);
	  System.out.println("Enter name:");
	  String name= s.next();
	  System.out.println("Enter phone_no:");
	  long ph_no = s.nextLong();
	  System.out.println("Enter age:");
	  byte age1 = s.nextByte();
	  System.out.println("Enter short value:");
	  short b = s.nextShort();
	  System.out.println("Enter float value:");
	  float f = s.nextFloat();
	  System.out.println("Enter double value:");
	  double d = s.nextDouble();
	  System.out.println("Enter character:");
	  String n1 = s.next();
	  System.out.println("Enter Boolean Value:");
	  boolean b1 = s.nextBoolean();
	  
	  
	  
	  
	  s.close(); //adding a close method after all IO is done
		
	}

		
		
	}


