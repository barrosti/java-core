package br.com.javaCore.threads;


public class MikeTyson extends Thread{

	private int health = 100;
	private Holyfield holyfield;
	private boolean stopFight = false;
	
	public MikeTyson() {
	}
	
	@Override
	public void run() {
		
		
		while(getHealth() > 0 && holyfield.getHealth() > 0 && holyfield.isStopFight() == false)
		{
			holyfield.punch();
			System.out.println("Mike Tyson PUNCH Holyfield");
		}
		
		setStopFight(true);
		
		if(getHealth() > 0)
			System.out.println("*** Mike Tyson Wins !! ***");
		else
			System.out.println("*** Holyfield Wins !! ***");
		
		System.out.println("## Remaining Health: | Mike Tyson: " + health + " | HolyfieldH: "+holyfield.getHealth() + " ##");
		System.exit(0);
	}

	public void punch()
	{
		--health;
	}
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public Holyfield getHolyfield() {
		return holyfield;
	}

	public void setHolyfield(Holyfield student) {
		this.holyfield = student;
	}

	public boolean isStopFight() {
		return stopFight;
	}

	public void setStopFight(boolean stopFight) {
		this.stopFight = stopFight;
	}
	
}
