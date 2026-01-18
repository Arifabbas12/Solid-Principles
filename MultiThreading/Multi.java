package MultiThreading;

class PrintNumbers extends Thread {
    public void run() {
        for(int i=1; i<=5; i++) {
            System.out.println("Numbers: " + i);
             try {
                Thread.sleep(2000); // Sleep for 50 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
        }
        }
    }
}

class PrintAlphabets extends Thread {
    public void run() {
        for(char c='A'; c<='E'; c++) {
            System.out.println("Alphabets: " + c);

           
    }
}
}

public class Multi {
     public static void main(String[] args) {
        System.out.println("Main thread started. " + Thread.currentThread().getName());
        PrintNumbers t1 = new PrintNumbers();
        PrintAlphabets t2 = new PrintAlphabets();

        t1.start();
        t2.start();
    }
    
}



