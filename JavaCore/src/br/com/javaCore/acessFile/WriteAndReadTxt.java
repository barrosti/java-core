package br.com.javaCore.acessFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteAndReadTxt {
	
	private final static String SUFIX_PATH_TXT = "\\dataBase\\writeObject.txt";
	
	public static void main(String[] args) {
		
		writeTxt();
		
		printPeople(loadPeople());
	}
	
	public static void writeTxt()
	{
		try {
			
			ArrayList<Person> c = new ArrayList<Person>();
			c.add(new Person(135,"Jhon", true));
			c.add(new Person(246,"Peter",false));
			c.add(new Person(789,"Walker",true));
			c.add(new Person(159,"Jenifer",true));
			c.add(new Person(132,"Marta",false));
			
			File file = new File(System.getProperty("user.dir") + SUFIX_PATH_TXT);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for (Person person : c) {
				bw.write(person.getSocialSecurity()+";"+ person.getName() +";"+ person.isSpeakEnglish());
				bw.newLine();
			}
			
			bw.close();
			fw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Person> loadPeople()
	{
		ArrayList<Person> people = new ArrayList<Person>();
		File file = new File(System.getProperty("user.dir") + SUFIX_PATH_TXT);
		try {
			FileReader fw = new FileReader(file);
			BufferedReader bw = new BufferedReader(fw);
			String line;
			while ((line = bw.readLine()) != null) {
				int index = 0;
				String[] informations = line.split(";");

				Person p = new Person();
				p.setSocialSecurity(Integer.parseInt(informations[index++]));
				p.setName(informations[index++]);
				p.setSpeakEnglish(Boolean.parseBoolean(informations[index++]));

				people.add(p);
			}
			
			bw.close();
			fw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return people;
	}
	
	public static void printPeople(ArrayList<Person> people)
	{
		for (Person person : people) {
			System.out.println(person.toString());
		}
	}
}
