import java.util.Scanner;

public class CapturaEntrada {

    public static String CapturarString(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("" + msg + ":");
        return (sc.nextLine());
    }
}