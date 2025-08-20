// #Interface in java

// An interface in java is a blueprint of class.
// (i)it has constant and abstract methods.
// (ii) Interface cannnot be instanciated just like the abstract class
// (iii). Since JDK 8, we can have default & static methods.
// (iv). Since JDK 9, we can have private methods in an interface.

// 2.why we use a java interface
// (i) its used to achive abstraction
// (ii) by interface we can support the functionality of multiple inheritance.
// (iii) its used to achive loose coupling.

// Wap to create a interface Shape with 3 methods area,perimeter and display. And create 3 classes rectangle, triangle and polygon which calculates the area and perimeter and display them.

import java.util.*;

interface Shape {
    void area();

    void perimeter();

    void display();
}

class Rectangle implements Shape {
    int x, y, a, p;

    Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void area() {
        this.a = x * y;
    }

    public void perimeter() {
        this.p = 2 * (x + y);
    }

    public void display() {
        System.out.println("Rectangle Area : " + a + "\nRectangle Perimeter : " + p);
    }

}
class Triangle implements Shape {
    float x, y,z, a, p;

    Triangle(float x, float y,float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void area() {
        float s = this.p/2;
        this.a = (float) Math.sqrt(s * (s - x) * (s - y) * (s - z));
    }

    public void perimeter() {
        this.p = x + y + z;    
    }

    public void display() {
        System.out.println("Triangle Area : " + a + "\nTriangle Perimeter : " + p);
    }

}
class Pentagon implements Shape {
    float side, a, p;

    Pentagon(float side) {
        this.side = side;
    }

    public void area() {
        this.a = (float) (1.72 * side * side); // Approximate area for regular pentagon
    }

    public void perimeter() {
        this.p = 5 * side;
    }

    public void display() {
        System.out.println("Pentagon Area : " + a + "\nPentagon Perimeter : " + p);
    }
}

class Main {
    public static void main(String args[]) {
        Shape rect,tri,pent;
        rect = new Rectangle(5, 10);
        rect.area();
        rect.perimeter();
        rect.display();

        tri = new Triangle(3, 4, 5);
        tri.perimeter();
        tri.area();
        tri.display();

        pent = new Pentagon(6);
        pent.area();
        pent.perimeter();
        pent.display();
    }
}
