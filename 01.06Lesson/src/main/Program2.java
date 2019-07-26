package main;

import java.awt.event.FocusAdapter;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Program2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
//		try {
//			url = new URL("http://www.issoft.by/wp-content/uploads/2013/02/564-700x260.jpeg");
//		} catch (MalformedURLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
//		try (
//			InputStream is = url.openStream();
//			FileOutputStream fos = new FileOutputStream("img.png");
//				){
//		
//			
//			int b;
//			
//			while((b=is.read()) != -1) {
//				fos.write(b);
//			}
//			
//		
//			
//		
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
//		
		FileWriter fw = new FileWriter("users", true);
		User u = new User ("Illia3", "12sf6");
		
		fw.write(u.toString());
		
		fw.flush();
		fw.close();
//		
//		
//		FileReader fr = new FileReader ("users");
//		BufferedReader br = new BufferedReader(fr);
//		
//		String line = br.readLine();
//		String[] strs = line.split("--- ");
//		
//		User fromFile = new User(strs[0], strs[1]);
//		
//		System.out.println(fromFile.getName());
//		
//		fr.close();
//		br.close();
//		
//		User user = new User("Anton", "12345", new Address ("Lviv", "Franka"));
//		
//		FileOutputStream fos = new FileOutputStream("backup");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		
//		oos.writeObject(user);
//		
//		FileInputStream fis = new FileInputStream("backup");
//		ObjectInputStream ois = new ObjectInputStream(fis);
//		
//		Object o = ois.readObject();
//		System.out.println(o);

	}
}
