class B{
    void ageValied(int n){
        if (n<18) {
            throw new ArithmeticException("Not eligible to vote!");
        }
        else{
            System.out.println("Eligible to vote.");
        }
    }
    public static void main(String[] args) {
        int n=15;
        B ob = new B();
        try {
            ob.ageValied(n);
        } catch (Exception e) {
            System.out.println("The error is : "+e);
        }
        System.out.println("Not error.");
    }
}