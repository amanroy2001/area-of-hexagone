package codewithaman;
import java.util.Scanner;
public class areaofhexagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc= new Scanner(System.in);
 System.out.println("enter the side of hexagone");
 double x=sc.nextDouble();
 double area=((3*Math.pow(3,0.5))*Math.pow(x,2))/2;
 System.out.println("area of hexagone "+area);
	}

}
