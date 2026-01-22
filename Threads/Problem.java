package Threads;

 class MyThreads extends Thread{
    public void run(){
        System.out.println("Thread is running" +" "+ Thread.currentThread().getName());
        
    }

    public void fast(){
        System.out.println("Thread is fastning" +" "+ Thread.currentThread().getName());
    }
}
public class Problem {
    public static void main(String args[]){
       
        MyThreads t1 = new MyThreads();
        t1.start();
        
        t1.fast();
        
       
         
    }
}
