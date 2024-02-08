package Variables;

public class Global_2 {
	static int a;
	 

	public static void main(String[] args) 
	{
		int a;
		a= 100;
		Global_2.a= 100;  // to call static global variable
		System.out.println(a);
		System.out.println(Global_2.a);
		
		

	}

}
