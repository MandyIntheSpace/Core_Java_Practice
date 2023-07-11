package Deadlock_In_Java;

public class DeadlockExample {
    final static String R1 = "Dead Lock Example";
    final static String R2 = "Learn more about Thread Deadlock";

    public static void main(String[] args) {
        Thread T1 = new Thread() {
            public void run() {
                synchronized(R1) {
                    System.out.println("Threas T1 locked ----> Resource R1");
                    synchronized(R2) {
                        System.out.println("Thread T1 locked ----> Resource R2");
                }
                }
            }
        };
        Thread T2 = new Thread(){
            public void run() {
            synchronized(R2) {
                System.out.println("Thread T2 locked ----> Resource R2");

                synchronized(R1) {
                    System.out.println("Thread T2 locked ----> Resource R1");

                }
            }
        }
        };
        T1.start();
        T2.start();
    }
}
