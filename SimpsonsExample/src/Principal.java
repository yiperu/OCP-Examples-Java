/**
 * Created by yiperu on 6/26/17.
 */
public class Principal {

    public static void main (String[] args){

        Homer homero = new Homer();
        homero.drunkBeers = 2;
        homero.eatenDonuts = 2;
        SimpsonDrawer draw = new SimpsonDrawer();
        draw.drawer(homero);
    }
}
