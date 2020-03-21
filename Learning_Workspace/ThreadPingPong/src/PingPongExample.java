
/*public class PingPongExample {
	
	static int trun;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(()->{
							while(true) {
								System.out.println("ping")
							}
						}
		);
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				while(true) {					
					try {
						trun=1;
						System.out.println(display(trun));
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		Thread t3 = new Thread(new Runnable() {
			public void run() {
				while(true) {
					try {
						trun=0;
						System.out.println(display(trun));
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		t3.start();
		t2.start();

	}

	protected static synchronized String display(int trun2) {
		// TODO Auto-generated method stub
		if(trun==1)
			return "ping";
		else
			return "pong";
	}

}
*/




class PingPongExample implements Runnable

{

    String word;
    
    PingPongExample(){
    	
    }

    PingPongExample(String s)

    {  

           word = s;

    }

    public void run()

    {

    try

        {

             for(int  i = 0; i<30; i++)

              {

                         System.out.println(word);

                         Thread.sleep(100) ;

               }

         }catch (InterruptedException e)

         { e.printStackTrace(); }

    }

 

    public static void main(String[] args)

    { 

         Runnable p1 =  new PingPongExample("ping");

        Thread    t1 = new Thread(p1);

         t1.start();

         //start another thread;

        Runnable p2 = new PingPongExample("pong");

        Thread t2 = new Thread(p2);

        t2.start();

    }

} 