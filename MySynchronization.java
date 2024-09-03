public class MySynchronization {
    public static void main(String[] args) {
        
        DemoSynchronization demoSynchronization1 = new DemoSynchronization();
        DemoSynchronization demoSynchronization2 = new DemoSynchronization();


        demoSynchronization1.start();
        demoSynchronization2.start();

       

    }
}


class DemoSynchronization extends Thread{

    static synchronized void print(){
        for(int i =0;i<5;i++){
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            
        }
    }

    @Override
    public void run() {
        synchronized(this){
            print();

        }
       
    }

    


}