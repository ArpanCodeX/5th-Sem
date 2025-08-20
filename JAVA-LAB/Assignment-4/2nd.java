// Ways to achive abstraction: its a process of identy implementation details & showing only functionality of the user
// There are 2 ways :
// (i) using asbstract class : rules-
// (a) an asbstract class must be declared with the asbstract keyword
// (b) It can have asbstract and non asbstract methods
// (c) It cannot be instanciated
// (d) it can have final methods
// (e) It can have constructors and static methods also
// (f) 
// Write a asbstract class shape with two asbstract methods (area and perimeter). make another 3 classes rectangle and triangle and polygon that inherits same class. Create objects to show the concept of abstraction.
// (ii) using interface

abstract class Shape {
    abstract void area();
    abstract void perimeter();
    public void display() {
        System.out.println("This is Shape class.");
    }
}
class Rectangle extends Shape {
    int a, p;
    void area(int l, int b) {
        this.a = l * b;
    }
    void perimeter(int l, int b) {
        this.p = 2 * (l + b);
    }
    void display() {
        System.out.println("Rectangle Area : " + a + "\nRectangle Perimeter : " + p);
    }
}
