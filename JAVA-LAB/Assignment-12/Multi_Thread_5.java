// Create multiple threads. 

class NewThread implements Runnable {

    String name; // name of thread 
    Thread t;

    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start(); // Start the thread 
    }
    // This is the entry point for thread. 

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + " exiting.");
    }
}

class MultiThreadDemo {

    public static void main(String args[]) {
        NewThread ob1 = new NewThread("1st");
        NewThread ob2 = new NewThread("2nd");
        NewThread ob3 = new NewThread("3rd");
        System.out.println(ob1.t.isAlive());
        System.out.println(ob2.t.isAlive());
        System.out.println(ob3.t.isAlive());
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println("Main thread : " + n);
                Thread.sleep(100);
            }
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println(ob1.t.isAlive());
        System.out.println(ob2.t.isAlive());
        System.out.println(ob3.t.isAlive());
        System.out.println("Main thread exiting.");
    }
}
