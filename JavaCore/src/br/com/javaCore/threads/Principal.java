package br.com.javaCore.threads;

public class Principal {

	
	public static void main(String args[])
	{
		try {
			Holyfield holy = new Holyfield();
			MikeTyson mk = new MikeTyson();
			
			holy.setMike(mk);
			mk.setHolyfield(holy);
			
			holy.setPriority(6);
			mk.setPriority(4);
			
			mk.start();
			holy.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
