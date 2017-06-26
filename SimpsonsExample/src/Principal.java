import java.util.Objects;

/**
 * Created by yiperu on 6/26/17.
 */
public class Principal {

    public static void main (String[] args){

        Homer homero = new Homer();
        Marge marge = new Marge();
        Bart bart = new Bart();
        Lisa lisa = new Lisa();
        Maggie maggie = new Maggie();

        homero.drunkBeers = 2;
        homero.eatenDonuts = 2;

        Object[] arreglo = new Object[5];
        arreglo[0] = homero;
        arreglo[1] = marge;
        arreglo[2] = bart;
        arreglo[3] = lisa;
        arreglo[4] = maggie;

        SimpsonDrawer draw = new SimpsonDrawer();
        draw.draw(arreglo);
    }
}
