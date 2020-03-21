import java.util.concurrent.BlockingQueue;

public class Pong extends Thread{
	BlockingQueue<String> shared;
	
	Pong(BlockingQueue<String> shared){
		this.shared=shared;
	}
	
	public void run() {
		while(true) {
			//String value =shared.remove();
			try {
			System.out.println(shared.take());
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
