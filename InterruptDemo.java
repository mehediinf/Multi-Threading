public class InterruptDemo {
    public static void main(String[] args) {
        MyInterrapt myInterrapt = new MyInterrapt();
        myInterrapt.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        myInterrapt.interrupt();


    }
}

class MyInterrapt extends Thread{

    @Override
    public void run() {
    try {
                
        for(int i=1;i<=5;i++){
            if (Thread.currentThread().isInterrupted()) {

                System.out.println("Thread was interrupted...");
                return;
                
            }
            System.out.println("MyInterrupt: "+i);
            sleep(3000);
           
            
        }
    }catch (InterruptedException e) {
        System.out.println("Thread was interrupted during sleep...");
    }
    }
}
