import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import clase.Ferma;
import clase.Player;
public class Main {

	public static void main(String[] args) {
		System.out.println("Kek");
		Ferma ferma = new Ferma(10,10,10);
		Player player1 = new Player("0",0,0,0,true,0);
		Player player2 = new Player("1",0,0,0,true,0);
		ExecutorService executor = Executors.newCachedThreadPool();
		executor.execute(player1);
		executor.execute(player2);
		executor.execute(ferma);
		//player1.run();
		//player2.run();
		//ferma.run();
	}

}
