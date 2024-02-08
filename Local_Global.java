package Variables;

public class Local_Global
{   static int a;
    static double b;
      static void add()
      {  a=100;
         b= 30.5;
         double c = a+b;
         System.out.println(c);
      
    	    }
    static void subst()
    {
    	a=50;
    	b=10.5;
    	double c = a-b;
    	System.out.println(c);
    }

	public static void main(String[] args)
	{       a= 200;
	        b= 3;
	        double c= a*b;
	        System.out.println(c);
          add();
          subst();


	}

}
