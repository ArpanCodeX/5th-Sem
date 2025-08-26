class NewThread implements Runnable{
    Thread t;
    String ThreadName;

NewThread(String name){
    ThreadName = name;
    t = new Thread(this,ThreadName);
    System.out.println("Child Thread: "+t);
    t.start();
}

public void run(){
    try {
    for(int n = 5; n > 0; n--) {
    System.out.println("Child Thread: "+n);
    Thread.sleep(200);
    }
    } catch (InterruptedException e) {
    System.out.println("Main thread interrupted");
    }
    System.out.println("Exit");
    }
}

class Multithread{
    public static void main(String[] args) {
        new NewThread("One"); 
        new NewThread("Two");
        new NewThread("Three");
        try {
        Thread.sleep(10000);
        } catch (InterruptedException e) {
        System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
        }
    }

