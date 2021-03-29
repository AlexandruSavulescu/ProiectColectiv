package clase;

public class Player implements Runnable
{
	String nume;
	int lemn;
	int piatra;
	int fier;
	boolean mercenar;
	int level;
	public Player(String nume, int lemn, int piatra, int fier, boolean mercenar, int level) {
		super();
		this.nume = nume;
		this.lemn = lemn;
		this.piatra = piatra;
		this.fier = fier;
		this.mercenar = mercenar;
		this.level = level;
	}
	@Override
	public String toString() {
		return "Player"+nume+" [lemn=" + lemn + ", piatra=" + piatra + ", fier=" + fier + ", mercenar=" + mercenar + ",level=" +level +  "]";
	}
	@Override
	public void run()
	{
		System.out.println("Player " + this.nume + " ready");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Player " + this.nume + "stopped");
	}
}
