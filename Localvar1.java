package Variables;

public class Localvar1
     {
	     int a =100;  ///non static gv
	     int b= 50;
	    int sum = a+b;
	    int diff =a-b;
	     static void add() 
	     {  Localvar1 l1= new Localvar1();
	       
	         System.out.println("The sum is :" +l1.sum); 
	         l1.add1(); //non ststic nethod call in static area by creating object
	          	 
	     }
	     static void subst() 
		     {  
	    	  Localvar1 l1= new Localvar1();
	  	    
		         System.out.println("The substraction is :" +l1.diff); 
		          	 
		         
		    }
	     void add1()
	     {System.out.println("non static method");
	    	 
	     }

	public static void main(String[] args) 
	{     add();
	   subst();
			}
}
