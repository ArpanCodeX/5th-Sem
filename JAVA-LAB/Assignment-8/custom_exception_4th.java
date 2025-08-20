
class ude extends Exception{
    public ude(String x){
        super(x);
    }

}
class Hello{
void ageValied(int n) throws ude{
        if (n<18) {
            throw new ude("Not eligible to vote!");
        }
        else{
            System.out.println("Eligible to vote.");
        }
    }
    public static void main(String[] args) {
        int n=15;
        Hello ob = new Hello();
        try {
            ob.ageValied(n);
        } catch (ude e) {
            System.out.println("The error is : "+e);
        }
        System.out.println("Not error.");
    }
}