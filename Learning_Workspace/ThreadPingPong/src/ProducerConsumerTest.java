import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerTest {

	public static Queue<String> q = new LinkedList<>();
	public static int size = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producer p = new Producer(q, size);
		Consumer c = new Consumer(q, size);
		
		Thread t1 = new Thread(p,"Producer");
		Thread t2 = new Thread(c,"Consumer");
		
		t1.start();
		t2.start();
	}

}

class Producer implements Runnable{
	
	public static Queue<String> q;
	public static int size;

	public Producer(Queue<String> q, int size) {
		// TODO Auto-generated constructor stub
		this.q = q;
		this.size = size;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0 ; i<10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try {
				synchronized (q) {
					while(q.size() == size) {
						q.wait();
					}
					q.add("sachin"+i);
					q.notifyAll();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
	
}

class Consumer implements Runnable{
	
	public static Queue<String> q;
	public static int size;

	public Consumer(Queue<String> q, int size) {
		// TODO Auto-generated constructor stub
		this.q = q;
		this.size=size;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			synchronized (q) {
				while(q.isEmpty()) {
					try {
						q.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Consume : " + q.poll());
				q.notifyAll();
			}
		}
	}
	
}
