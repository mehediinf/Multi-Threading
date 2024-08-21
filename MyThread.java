public class MyThread {
    public static void main(String[] args) {
        
        ThreadCls threadCls = new ThreadCls();
        threadCls.start();

        try {
            threadCls.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Main Class is a End..");

    }
}

class ThreadCls extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=5;i++){

            System.out.println(i);

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
