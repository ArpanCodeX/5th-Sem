interface shape3d {
    void area();
    void volume();
    void display();
}

class cuboid implements shape3d {
    int l, w, h;
    int sa, v;

    cuboid(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    public void area() {
        sa = 2 * (l * w + w * h + h * l);
    }

    public void volume() {
        v = l * w * h;
    }

    public void display() {
        System.out.println("cuboid: " + sa + " " + v);
    }
}

class prism implements shape3d {
    int ba, bp, h;
    int sa;
    float v;

    prism(int ba, int bp, int h) {
        this.ba = ba;
        this.bp = bp;
        this.h = h;
    }

    public void area() {
        sa = 2 * ba + bp * h;
    }

    public void volume() {
        v = ba * h;
    }

    public void display() {
        System.out.println("prism: " + sa + " " + v);
    }
}

class globe implements shape3d {
    int r;
    double sa, v;

    globe(int r) {
        this.r = r;
    }

    public void area() {
        sa = 4 * Math.PI * r * r;
    }

    public void volume() {
        v = (4.0 / 3) * Math.PI * r * r * r;
    }

    public void display() {
        System.out.println("globe: " + sa + " " + v);
    }
}

public class main3d {
    public static void main(String[] args) {
        shape3d c = new cuboid(4, 5, 6);
        shape3d p = new prism(20, 18, 10);
        shape3d g = new globe(7);

        c.area();
        c.volume();
        c.display();

        p.area();
        p.volume();
        p.display();

        g.area();
        g.volume();
        g.display();
    }
}
