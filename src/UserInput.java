import java.util.Scanner;

public class UserInput {
    /**
     * Пользовательский ввод
     * @return Строка введенная пользователем
     */
    public static String input() {
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }
}