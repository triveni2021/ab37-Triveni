package Variables;

public class Localvar
{
           void add (int b)
           {
        	  // int b= 10; // decl and init of lv
        	   System.out.println(b);
           }
          static void add(double b)
          {
        	  System.out.println(b);
        	  
          }
          static void  add (int a, double b)
          {
        	  System.out.println(a);
        	  System.out.println(b);
          }
	
	public static void main(String[] args) 
	{
		int a; // declaration of local variable
		a= 100; // initilization of lv
		System.out.println(a);
		add(30.4);
		Localvar l1 = new Localvar();
		l1.add(100);
		add(110, 29.6);

	}

}
