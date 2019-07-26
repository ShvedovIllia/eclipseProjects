package main;

import java.io.*;

public class Program {
	public static void main(String[] args) throws Exception {
		
		File file = new File ("text.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		
//		FileOutputStream fos = new FileOutputStream(file, true);
//		for (int i=0; i<128; i++) {
//			fos.write(i);
//		}
//		
//		fos.close();
//		
		FileInputStream fis = new FileInputStream(file);
		
		int b;
		while ((b=fis.read()) !=-1) {
		
			System.out.println((char) b);
		}
	}
}
