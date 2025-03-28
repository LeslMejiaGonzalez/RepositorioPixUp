import java.util.Scanner;

public class ReadUtil {
    private static final Scanner scanner = new Scanner(System.in);

    public static String read() {
        return scanner.nextLine();
    }

    public static int readInt() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.print("Número inválido. Intente de nuevo: ");
            return readInt();
        }
    }
}