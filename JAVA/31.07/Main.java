interface Shape {
    void area();
    void perimeter();
    void display();
}
class Rect implements Shape {
    int x, y, z, p;
    Rect(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void area() {
        this.p = x * y;
    }
    public void perimeter() {
        this.z = 2 * (x + y);
    }
    public void display() {
        System.out.println("Rect: " + (p +" "+ z));
    }
}
class Tr implements Shape {
    int br, w, a, b, c, ar;
    float p;
    Tr(int a, int b, int c, int br, int w) {
        this.br = br;
        this.w = w;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void area() {
        this.p = 0.5f * br * w;
    }
    public void perimeter() {
        this.ar = a + b + c;
    }
    public void display() {
        System.out.println("Tr: " + (p+" "+ar));
    }
}
class Penta implements Shape {
    int a, l, p;
    float z;
    Penta(int a, int l) {
        this.a = a;
        this.l = l;
    }
    public void perimeter() {
        this.p = 5 * l;
    }
    public void area() {
        this.z = 0.5f * a * p;
    }
    public void display() {
        System.out.println("Penta: " + (p +" "+ z));
    }
}
public class Main {
    public static void main(String args[]) {
        Shape rect = new Rect(5, 6);
        Shape tr = new Tr(2, 3, 4, 6, 8);
        Shape penta = new Penta(10, 70);
        rect.area();
        rect.perimeter();
        rect.display();
        tr.area();
        tr.perimeter();
        tr.display();
        penta.perimeter();
        penta.area();
        penta.display();
    }
}
