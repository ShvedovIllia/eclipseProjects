package main;

import java.util.concurrent.TimeUnit;

public class MyRunnable implements Runnable{

	private String name;

		public MyRunnable(String name) {
			this.name = name;
		}


		public void run() {
			for (int i = 0; i < 5; i++) {
				try {
//					sleep(1000);
					TimeUnit.MICROSECONDS.sleep(500);
					System.out.println(name + "" + i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}
	}
