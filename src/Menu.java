import Exceptions.NoDateException;
import Exceptions.NoFIOException;
import Exceptions.NoGenderException;
import Exceptions.NoPhoneException;

import java.util.Scanner;

public class Menu {
    /**
     * Основное меню
     */
    public void mainMenu() {
        boolean flag = false;
        Scanner s = new Scanner(System.in);
        while (!flag) {
            System.out.println(UserInterface.firstMenu());
            String change = s.nextLine().replaceAll(" ", "");
            if (change.equals("1")) {
                flag = true;
                try {
                    PeopleAdder.searcher();
                } catch (NoDateException | NoPhoneException | NoGenderException | NoFIOException | RuntimeException e) {
                    System.out.println(e.getMessage());
                }
                finally {
                    mainMenu();
                }
            } else if (change.equals("2")) {
                flag = true;
                System.out.println(UserInterface.exitProgramMessage());
            } else {
                System.out.println(UserInterface.incorrectValueMessage());
            }
        }
    }
}
