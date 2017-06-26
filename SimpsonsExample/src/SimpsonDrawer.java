import java.util.Objects;

import static jdk.nashorn.internal.objects.Global.print;
import static jdk.nashorn.internal.objects.Global.println;

/**
 * Created by yiperu on 6/26/17.
 */
public class SimpsonDrawer {

    public void draw (Cartoon[] simpsons){

        for (Cartoon simpson : simpsons) {
            simpson.draw();
        }
    }
}
