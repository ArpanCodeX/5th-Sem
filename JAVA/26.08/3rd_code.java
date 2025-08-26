class NewThread extends Thread{
    Thread t;

NewThread(){
    t = new Thread(this,"My Thread");
    System.out.println("Child Thread: "+t);
    t.start();
}

public void run(){
    try {
    for(int n = 5; n > 0; n--) {
    System.out.println("Child Thread: "+n);
    Thread.sleep(2000);
    }
    } catch (InterruptedException e) {
    System.out.println("Main thread interrupted");
    }
    System.out.println("Exit");
    }
}

class ThreadDemo{
    public static void main(String[] args) {
        new NewThread();
        try {
            for(int n = 5; n > 0; n--) {
            System.out.println("Main Thread: "+n);
            Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupted");
            }
    System.out.println(" Main Exit");
    }
}



