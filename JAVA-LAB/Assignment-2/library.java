import java.util.Scanner;

class Library {
    String name;
    int isbn;
    float price;

    // Default or non- parameterized
    public Library() {
        this.name = "Unknown";
        this.isbn = 1234;
        this.price = 0;
    }

    // Parameterized constructor
    public Library(String name, int isbn, float price) {
        this.name = name;
        this.isbn = isbn;
        this.price = price;
    }

    // Copy constructor
    public Library(Library cpy) {
        this.name = cpy.name;
        this.isbn = cpy.isbn;
        this.price = cpy.price;
    }

    public void display() {
        System.out.println("Book Name: " + name);
        System.out.println("ISBN Number: " + isbn);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book Name: ");
        String name = sc.nextLine();
        System.out.print("Enter ISBN Number: ");
        int isbn = sc.nextInt();
        System.out.print("Enter Price: ");
        float price = sc.nextFloat();

        // default Constructor
        Library b1 = new Library();
        System.out.println("\nThis is default constructor!");
        b1.display();

        Library b2 = new Library(name, isbn, price);
        System.out.println("\nThis is parameterized constructor!");
        b2.display();

        Library b3 = new Library(b2);
        System.out.println("\nThis is copy constructor of !");
        b3.display();

        sc.close();
    }
}
