package clase;
public class Ferma implements Runnable
{
	int lemn;
	int piatra;
	int fier;
	public Ferma(int lemn, int piatra, int fier)
	{
		super();
		this.lemn = lemn;
		this.piatra = piatra;
		this.fier = fier;
	}
	@Override
	public void run()
	{
		System.out.println("Ferma produce resurse!");
		try {
			int i = 0;
			while(i != 3)
			{
			Thread.sleep(3000);
			System.out.println(this);
			i++;
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ferma s-a oprit");
	}
	@Override
	public String toString() {
		return "Am primit informatii referitoare la ferma [lemn=" + lemn + ", piatra=" + piatra + ", fier=" + fier + "]";
	}
	
}
