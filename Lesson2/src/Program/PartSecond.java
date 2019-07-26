package Program;

import java.util.Scanner;

public class PartSecond {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
//		System.out.println("------------First task: ever or add------------");
//		System.out.println("Enter X: ");
//		int x = scan.nextInt();
//		
//		if (x%2==1 || x%2==-1) 
//		{
//		System.out.println("ODD");
//		}
//		else if (x==0)
//		{
//			System.out.println("Your number is 0");
//		}
//		else 
//		{
//			System.out.println("EVEN");
//		}
		
//		System.out.println("------------Second task: closer to 10 ------------");
//		
//		System.out.println("Enter N: ");
//		double n = scan.nextDouble();
//		System.out.println("Enter M: ");
//		double m = scan.nextDouble();
//		
//		double nTemp = n-10;
//		double mTemp = m-10;
//		
//		if (nTemp < 0)
//		{
//			nTemp=nTemp*(-1);
//		}
//		if (mTemp < 0)
//		{
//			mTemp=mTemp*(-1);
//		}
//		if (nTemp < mTemp) 
//		{
//			System.out.println("N is closer to 10");
//		}
//		if (nTemp > mTemp) 
//		{
//			System.out.println("M is closer to 10");
//		}
		
		
		System.out.println("------------Third task: quadratic eduation ------------");
		
		System.out.println("Enter A: ");
		int a = scan.nextInt();
		System.out.println("Enter B: ");
		int b = scan.nextInt();
		System.out.println("Enter C: ");
		int c = scan.nextInt();
		double x1, x2;
		
		System.out.println(a+"x^2 + " + b + "x + " + c + " = 0");
		
		int D = b*b-(4*a*c);
		System.out.println("Discriminator = " + D);
		
		if (D > 0) {
		x1=(-b+Math.sqrt(D)/(2*a));
		x2=(-b-Math.sqrt(D)/(2*a));
		System.out.println("x1=" + x1 + ", x2 = " + x2);
		} else if (D==0)
		{
			x1=-(b/(2*a));
			System.out.println("x = " + x1);
		}
		else {System.out.println("D<0.It`s bad=( ");}
	}

}
