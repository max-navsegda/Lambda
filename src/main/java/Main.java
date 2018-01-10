import java.awt.event.ActionListener;

/**
 * Created by Maxim on 1/10/2018.
 */
public class Main {

    public static void main(String[] args) {
        String a = "Bird";

        MyInterface myInterface = (s) -> System.out.println(s);
        myInterface.scream(a);
    }
}
