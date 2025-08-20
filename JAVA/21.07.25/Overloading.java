
class A{
    void Pr(int a,int b){
        System.out.println("The Area is "+a*b);
        System.out.println("The perimeter is"+2*(a+b));
    }
    void Pr(int a){
        System.out.println("The Area is "+Math.PI*a*2);
        System.out.println("The perimeter is"+Math.PI*a*a);
    }

    void Pr(int a,int b,int c){
        System.out.println("The perimeter is"+(a+b+c));
	}

	public static void main(String[] args) {
	System.out.println("For circle(7cm)");
	A ob=new A();
    ob.Pr(7);
	System.out.println("For rectangle(5,6)");
	ob.Pr(5,6);
	System.out.println("For triangle(3,4,5)");
	ob.Pr(3,4,5);
	}
}