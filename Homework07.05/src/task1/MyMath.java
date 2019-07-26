package task1;

public class MyMath {
	
	private final static double P =  3.1415;
	private final double E = 2.7182;
	
	public static double areaOfCircle(int Radius) {
		return 2*P*(Radius*Radius);
	}
	
	public static double perimeterOfCircle(int Radius) {
		return 2*P*Radius;
	}
	
	public static int sumOfTwoNums(int a, int b) {
		return a+b;
	}
}
