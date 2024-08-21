public class MyRunnableMain {

    public static void main(String[] args) {
      
        MyRunnable myRunnable = new MyRunnable();
        myRunnable.result();

        Thread thread = new Thread(myRunnable);
        thread.start();

    }
}

class A{

    public void result(){
        System.out.println("A Class has a method of result...");
    }
    
}

class MyRunnable extends A implements Runnable{   //A class have an extends and Runnable method is a implements of My runnable method
    @Override
    public void run() {
        
        for(int i =0;i<5;i++){
            System.out.println(i);
        }

    }
    
}

