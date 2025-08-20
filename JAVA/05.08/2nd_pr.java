class SecondProgram {
    public static void main(String[] args) {
        int n1 = 10, n2 = 20;

        try {
            float div = n2 / n1;
            System.out.println("Division is: " + div);
            int a[] = new int[5];
            a[7] = 10;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

