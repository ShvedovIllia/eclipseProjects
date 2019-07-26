
public class Program {
	
	public static void main(String[] args) {
//		test();
//		test("Hello");
//	
//	}
//	
//	public static void test (){
//		System.out.println("test");
//	}
//	
//		
//	public static void test(String text) {
//		System.out.println("test 2");
//	}
//	
//	public static double add (double a, double b) {
//		return a+b;
//	}
//	
//	public static long add (long a, long b) {
//		return a+b;
//	}
		
		Persin p = new Persin ("Ivan");
		Worker w = new Worker ("Yura");
		
		p.work("Yura ");
		w.work("Sasha ");
		
		p.toString();
		
		Recruter r = new Recruter();
		Developer d = new Developer();
		
		System.out.println(d.getSalary());
	}

	

}
