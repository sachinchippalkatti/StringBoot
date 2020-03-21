import java.util.concurrent.BlockingQueue;

public class Ping extends Thread {

	BlockingQueue<String> shared;
	
	Ping(BlockingQueue<String> shared){
		this.shared= shared;
	}
	
	public void run() {
		while(true) {
				try {
				System.out.println("ping");
				shared.put("pong");
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
