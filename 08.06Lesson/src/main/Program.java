package main;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.InputMismatchException;

public class Program {
	public static void main(String[] args) throws InputMismatchException{
//		MyThread t1 = new MyThread ("T1");
//		MyRunnable r1 = new MyRunnable("R1");
//		
//		Thread t2 = new Thread(r1);
//		
//		Thread t3 = new Thread() {
//		public void run() {
//			for (int i = 0; i < 5; i++) {
//				try {
//					t1.join();
//					System.out.println("T3:" + i);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//		}
//		
//		
//		
//		
//		System.out.println("Main end/");
//		}
//		};
//		t1.start();
//		t2.start(); 
//		t3.start();
//		
//		Counter c = new Counter();
//		Thread t4 = new Thread() {
//			public void run() {
//				for (int i = 0; i < 2000000; i++) {
//					c.increment();
//				}
//			}
//		};
//		Thread t5 = new Thread() {
//			public void run() {
//				for (int i = 0; i < 2000000; i++) {
//					c.increment();
//				}
//			}
//		};
//		
//		t4.start();
//		t5.start();
//		t4.join();
//		t5.join();
//		
//		System.out.println(c.getCount());
		
		Thread t6 = new Thread() {
			public void run() {
				int temp = 1;
				for(int i=1; i>50; i++) {
					temp *=i;
					System.out.println(temp);
				}
				
			}
		};
		
		URL url = null;
		Thread t7 = new Thread() {
			public void loadFile() throws IOException {
				try {
					url = new URL("http://www.issoft.by/wp-content/uploads/2013/02/564-700x260.jpeg");
					InputStream is = url.openStream();
					FileOutputStream fos = new FileOutputStream("img.png");
				} catch (MalformedURLException e1) {
					e1.printStackTrace();
				}
				

				
				System.out.println("file download is ended");
			}
		};
	
		t6.start();
		t7.start();
		
	}
}
