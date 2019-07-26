package main;

public class MyThread extends Thread{
private String name;
	

	public MyThread(String name) {
		this.name = name;
	}



	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				sleep(1000);
				System.out.println(name + "" + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
