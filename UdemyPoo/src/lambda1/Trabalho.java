package lambda1;

public class Trabalho implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("ping");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
