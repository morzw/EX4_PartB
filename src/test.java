import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;


public class test {

    public static void main(String[] args) {
        String testRegister ="register\n ophir\n 50\n 1.7\n 25\n y\n ori\n 2\n 3.3\n 9\n" +
                "n\n 123\n 123\n 20\n";
        String testExitPark = "exitPark\n ophir\n ";
        String exitFromSystem ="exit\n";
        Main.scanner =new Scanner(testRegister+testExitPark+exitFromSystem);
        Main.main(args);



    }
}
