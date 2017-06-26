import java.util.Objects;

import static jdk.nashorn.internal.objects.Global.print;
import static jdk.nashorn.internal.objects.Global.println;

/**
 * Created by yiperu on 6/26/17.
 */
public class SimpsonDrawer {

    public void draw (Object[] simpsons){

        for (Object simpson : simpsons) {
            if (simpson instanceof Homer){
                System.out.println("Homer Simpson");
            } else  if (simpson instanceof Marge) {
                System.out.println("Marge Simpson");
            } else  if (simpson instanceof Bart) {
                System.out.println("Bart Simpson");
            } else  if (simpson instanceof Lisa) {
                System.out.println("Lisa Simpson");
            } else  if (simpson instanceof Maggie) {
                System.out.println("Maggie Simpson");
            } else {
                System.out.print("... the hell I draw that?");
            }
        }
    }
}
