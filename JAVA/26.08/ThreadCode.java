class NewThreads implements Runnable {
    Thread t;

    NewThreads() {
        t = new Thread(this, "My Thread");
        System.out.println("Child Thread: " + t);
        t.start();
    }

    public void run() {
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println("Child Thread: " + n);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Exit");
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println("Main Thread: " + n);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupted");
        }
        System.out.println(" Main Exit");
    }
}
