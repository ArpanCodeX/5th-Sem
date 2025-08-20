class Third {
    public static void main(String[] args) {
        int n1=5,n2=0;
        try {
            String s = null;
            int a = Integer.parseInt(s);
            int b = s.length();
            System.out.println(s);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error!!!");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally{
            System.out.println("This is finally block!!");
        }
        System.out.println("No Error occured.");
    }
    
}
