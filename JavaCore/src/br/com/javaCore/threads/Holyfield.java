package br.com.javaCore.threads;


public class Holyfield extends Thread{

	private int health = 100;
	private MikeTyson mike;
	private boolean stopFight = false;
	
	public Holyfield()
	{
	}
	
	@Override
	public void run() {
		
		while(getHealth() > 0 && mike.getHealth() > 0 && mike.isStopFight() == false)
		{
			mike.punch();
			System.out.println("Holyfield PUNCH Mike Tyson");
		}
		
		setStopFight(true);
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

	public MikeTyson getMike() {
		return mike;
	}

	public void setMike(MikeTyson mike) {
		this.mike = mike;
	}

	public boolean isStopFight() {
		return stopFight;
	}

	public void setStopFight(boolean stopFight) {
		this.stopFight = stopFight;
	}
	
}
