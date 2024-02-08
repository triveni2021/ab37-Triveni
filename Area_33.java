package Variables;

public class Area_33 {
  final static double pi =3.14;
  
    void area1(int r)
    {
    	double area1 = pi*r*r;
    	System.out.println("Area of circle :"+area1);
    }
    void area2(int r)
    {
    	double area2 = pi*r*r;
    	System.out.println("Area of circle :"+area2);
    }
	public static void main(String[] args) {
		
		Area_33 a1= new Area_33();
		a1.area1(7);
		a1.area2(14);
	}

}
