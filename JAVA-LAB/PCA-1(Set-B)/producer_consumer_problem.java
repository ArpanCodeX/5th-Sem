
class Product {

    private int item;
    private boolean available = false;

    synchronized void produce(int value) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        item = value;
        available = true;
        System.out.println("Produced: " + item);
        notify();
    }

    synchronized int consume() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Consumed: " + item);
        available = false;
        notify();
        return item;
    }

    public static void main(String[] args) {
        Product product = new Product();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                product.produce(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                product.consume();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        });

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
        }
    }
}
