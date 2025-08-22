package lambda1;

public class MainTrablaho {

	public static void main(String[] args) {
		
		Trabalho trabalho1 = new Trabalho();
		Runnable trabalho2 = new Runnable() {			
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					try {
						Thread.sleep(1000);
						System.out.println("pong");
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
				
			}
		};
		Thread t1 = new Thread(trabalho1);
		Thread t2 = new Thread(trabalho2);
		
		t1.start();
		t2.start();
		
	}
}
