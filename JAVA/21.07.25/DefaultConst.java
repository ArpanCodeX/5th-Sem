import java.util.*;

class Library{
    float price;
    String name;
    int isbnNumber;

    Library(){
        this.price=0;
        this.name="Unknown";
        this.isbnNumber=0;
    }

    Library(float price,String name,int isbnNumber){
        this.price=price;
        this.name=name;
        this.isbnNumber=isbnNumber;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price");
        float price=sc.nextFloat();
        System.out.println("Enter the name");
        String name=sc.next();
        System.out.println("Enter the isbnNumber");
        int isbnNumber=sc.nextInt();
        Library l1=new Library(price,name,isbnNumber);
        System.out.println(l1.price+" "+l1.name+" "+l1.isbnNumber);
    }
}  