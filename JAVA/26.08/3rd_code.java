class NewThread extends Thread {
    NewThread() {
        super("My Thread");
        System.out.println("Child Thread: " + this);
        start();
    }

    public void run() {
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println("Child Thread: " + n);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupted");
        }
        System.out.println("Child Exit");
    }
}

class TD {
    public static void main(String[] args) {
        new NewThread();
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println("Main Thread: " + n);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main Exit");
    }
}
