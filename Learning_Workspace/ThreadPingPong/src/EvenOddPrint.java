
class EvenOddPrintWorker implements Runnable {
	
	static int count =1;
	int reminder;
	static Object lock = new Object();
	
	EvenOddPrintWorker(int reminder){
		this.reminder = reminder;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(count<10) {
			synchronized (lock) {
				while(count%2 != reminder) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Thread : "+ Thread.currentThread().getName() +" value :" + count);
				count++;
				lock.notifyAll();
			}
		}
	}

}

public class EvenOddPrint{
	
	public static void main(String arg[]) {
		EvenOddPrintWorker odd = new EvenOddPrintWorker(1);
		EvenOddPrintWorker even = new EvenOddPrintWorker(0);

		Thread t1 = new Thread(odd, "odd");
		Thread t2 = new Thread(even, "even");
		
		t1.start();
		t2.start();
	}
}