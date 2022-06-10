import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        PrintStream out = new PrintStream(System.out, true, StandardCharsets.UTF_8);
        out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num > 7) out.println("Привет");
}
}


