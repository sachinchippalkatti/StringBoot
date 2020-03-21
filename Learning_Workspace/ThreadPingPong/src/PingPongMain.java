import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class PingPongMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingQueue<String> shared = new LinkedBlockingDeque<>();
		
		Ping p = new Ping(shared);
		Pong q = new Pong(shared);
		
		p.start();
		q.start();
	}

}
