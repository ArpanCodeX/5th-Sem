// Student Controller

public class Sc {

    private Sm sm1;
    private Sv sv1;

    public Sc(Sm sm1, Sv sv1) {
        this.sm1 = sm1;
        this.sv1 = sv1;
    }

    public void view() {
        sv1.display(sm1.getRoll(), sm1.getName());
    }

    // Update the roll
    public void setRoll(int roll) {
        sm1.setRoll(roll);
    }

    // Update the name
    public void setName(String name) {
        sm1.setName(name);
    }

    // This is the method to response the roll to the main / client
    public int getRoll() {
        return sm1.getRoll();
    }

    // This is the method to response the name to the main / client
    public String getName() {
        return sm1.getName();
    }

}
