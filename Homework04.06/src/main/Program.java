package main;

import java.io.*;

public class Program {

	public static void main(String[] args) throws Exception {
		
		Commodity com = new Commodity("Samsung", "1000", "TV");
//		
//		File file = new File("text.txt");
//		if(!file.exists()) {
//			file.createNewFile();
//		}
//		
//		FileWriter fw = new FileWriter("commodity", true);
//		fw.write(com.toString());
//		
//		fw.flush();
//		fw.close();
		
		FileReader fr = new FileReader("commodity");
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		String[] strs = line.split("---");
		
		Commodity fromFile = new Commodity(strs[0], strs[1], strs[2]);
		
		System.out.println(fromFile.getCategory());
		fr.close();
		br.close();

	}

}
