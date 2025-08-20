
// Area and perimeter of rectangle , triangle and circle using method overloading
class OverLoad {

    void areaPeri(float length, float breath) {
        float area = length * breath;
        float peri = 2 * (length + breath);
        System.out.println("\nRectangle [Area] is : " + area + "\nRectangle [Perimeter] is : " + peri);
    }

    void areaPeri(float a, float b, float c) {
        float peri = a + b + c;
        float s = peri / 2;
        float area = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("\nTriangle [Area] is : " + area + "\nTriangle [Perimeter] is : " + peri);
    }

    void areaPeri(float radious) {
        float area = (float) Math.PI * (radious * radious);
        float peri = 2 * (float) Math.PI * radious;
        System.out.println("\nCircle [Area] is : " + area + "\nCircle [Perimeter] is : " + peri);
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        OverLoad o = new OverLoad();
        o.areaPeri((float) 2, (float) 2);
        o.areaPeri((float) 2, (float) 2, (float) 3);
        o.areaPeri((float) 4);
    }
    
}
