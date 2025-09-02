
class NewThread extends  Thread {
    NewThread() {
        super("Demo Thread");
        System.out.println("Child thread: " + this);
        start(); // Start the thread 
    }

    // This is the entry point for thread. 
    public void run() {
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println("Child thread : " + n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Exiting (Child) ...");
    }
}

class ThreadDemo {

    public static void main(String[] args) {
        new NewThread();

        try {
            for (int n = 5; n > 0; n--) {
                System.out.println("Main thread : " + n);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupted");
        }
        System.out.println("Exiting (Main) ...");
    }
}
