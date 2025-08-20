import java.io.*;

class New{
    void ageValied() throws FileNotFoundException{
        FileReader file = new FileReader("Assignment-8\\throw_1st.jav");
        BufferedReader br = new BufferedReader(file);
        
        if (br==null) {
            throw new FileNotFoundException("File not found!");
        }
        else{
            System.out.println("File found.");
        }
    }
    public static void main(String[] args) {

        New ob = new New();
        try {
            ob.ageValied();
        } catch (Exception e) {
            System.out.println("The error is : "+e);
        }
        System.out.println("Not error.");
    }
}