package Variables;

public class Circumferece {
	 final static double pi =3.14;
      void areaofcircle(int r)
     {   // int r=14;
          double area = 2*pi*r*r;
          System.out.println("Circumference of circle is:"+area);
   	  
     }
	public static void main(String[] args) 
	{      Circumferece  c1 = new Circumferece();
	
		c1.areaofcircle(12);
		  int r= 7;
		  double area1 = 2*pi*r*r;
		  System.out.println("Circumference of circle1 is:"+area1);

	}

}
