package br.com.javaCore.acessFile;

import java.io.Serializable;

public class Person implements Serializable{

	private static final long serialVersionUID = -9190907671663667718L;
	private int socialSecurity;
	private String name;
	private boolean speakEnglish;
	
	public Person(){}
	
	public Person(int socialSecurity,String name, boolean speakEnglish)
	{
		this.socialSecurity = socialSecurity;
		this.name = name;
		this.speakEnglish = speakEnglish;
	}

	public int getSocialSecurity() {
		return socialSecurity;
	}

	public void setSocialSecurity(int socialSecurity) {
		this.socialSecurity = socialSecurity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSpeakEnglish() {
		return speakEnglish;
	}

	public void setSpeakEnglish(boolean speakEnglish) {
		this.speakEnglish = speakEnglish;
	}

	public String toString()
	{
		return "Social Security: "+ this.getSocialSecurity() + " | "
				+ " Name: "+ this.getName() + " | "
				+ " Speak English: " + ( this.isSpeakEnglish()  ? "Yes" : "No");
	}
}
