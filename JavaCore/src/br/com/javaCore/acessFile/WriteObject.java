package br.com.javaCore.acessFile;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class WriteObject {
	public static void main(String[] args) {
		
		try {
			
			ArrayList<Person> c = new ArrayList<Person>();
			c.add(new Person(135,"Jhon", true));
			c.add(new Person(246,"Peter",false));
			c.add(new Person(789,"Walker",true));
			c.add(new Person(159,"Jenifer",true));
			c.add(new Person(132,"Marta",false));
			
			File f = new File(System.getProperty("user.dir") + "\\dataBase\\writeObject.dat");
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(c);
			oos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
