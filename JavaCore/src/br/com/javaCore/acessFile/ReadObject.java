package br.com.javaCore.acessFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObject {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		try {
			
			File file = new File(System.getProperty("user.dir") + "\\dataBase\\writeObject.dat");
			FileInputStream fiStream = new FileInputStream(file);
			ObjectInputStream oiStream = new ObjectInputStream(fiStream);
			
			ArrayList<Person> people = (ArrayList<Person>) oiStream.readObject();
			
			for (Person person : people) {
				System.out.println(person.toString());
			}
			
			fiStream.close();
			oiStream.close();
			
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
