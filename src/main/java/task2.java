import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        PrintStream out = new PrintStream(System.out, true, StandardCharsets.UTF_8);
        out.println("Введите имя: ");
        Scanner in = new Scanner(System.in, "UTF-8");
        String name = in.nextLine();
        if (name.intern().equals("Вячеслав")) {
            out.println("Привет,Вячеслав");
        } else {
            out.println("Нет такого имени");
        }

    }
}
