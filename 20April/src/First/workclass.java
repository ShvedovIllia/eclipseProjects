package First;

import java.util.Scanner;

public class workclass {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in);
	int x, y;

	y = scan.nextInt();
	x = scan.nextInt();
	task2 (y, x);
	
		

	}
	
	static int task2 (int a, int b)
	{
		int sum=0;
		
		sum = a+b;
		System.out.println(sum);
		return sum;
	}

}
