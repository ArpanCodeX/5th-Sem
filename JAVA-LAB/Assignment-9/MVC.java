
public class MVC {

    public static void main(String[] args) {
        Sm stm = new Sm();
        Sv stv = new Sv();
        Sc stc = new Sc(stm, stv);
        stc.setRoll(15);
        stc.setName("Joy");
        stc.view();
        stm.setName("Joy Santra");
        stc.view();
    }

}
