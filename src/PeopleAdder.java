import Exceptions.*;

import java.io.FileWriter;
import java.io.IOException;

public class PeopleAdder {
    /**
     * Поиск всех необходимых данных в строке и передача массива данных для записи в файл
     */
    public static void searcher() throws NoDateException, NoPhoneException, NoGenderException, NoFIOException {
        boolean flag = true;

        int index_data;

        String data;

        int index_phone_number;
        long phone_number;

        int index_firstname;
        String firstname;

        int index_lastname;
        String lastname;

        int index_surname;
        String surname;

        int index_gender;
        String gender;

        System.out.println(UserInterface.giveMeInfo());
        String user_input = UserInput.input();
        user_input = Parser.pars(user_input);
        String[] user_input_massive = user_input.split(" ");
        try {
            Validator.amountOfDataExamination(user_input_massive);
        } catch (WrongAmountOfDataException e) {
            System.out.printf("Количество данных должно быть равно 6, а вы ввели %d\n", e.getAmountOfData());
            flag = false;
        }
        if (flag) {
            // Поиск даты
            index_data = Validator.dataSearch(user_input_massive);
            if (index_data == 10) {
                throw new NoDateException();
            } else {
                data = user_input_massive[index_data];
                user_input_massive[index_data] = "0";
            }

            // Поиск номера телефона
            index_phone_number = Validator.phoneSearch(user_input_massive);
            if (index_phone_number == 10) {
                throw new NoPhoneException();
            } else {
                phone_number = Long.parseLong(user_input_massive[index_phone_number]);
                user_input_massive[index_phone_number] = "0";
            }

            // Поиск пола
            index_gender = Validator.genderSearch(user_input_massive);
            if (index_gender == 10) {
                throw new NoGenderException();
            } else {
                gender = user_input_massive[index_gender];
                user_input_massive[index_gender] = "0";
            }

            // Поиск Фамилии
            index_lastname = Validator.lastNameSearch(user_input_massive);
            if (index_lastname == 10) {
                throw new NoFIOException();
            } else {
                lastname = user_input_massive[index_lastname];
                user_input_massive[index_lastname] = "0";
            }

            // Поиск Имени
            index_firstname = Validator.firstNameSearch(user_input_massive);
            if (index_firstname == 10) {
                throw new NoFIOException();
            } else {
                firstname = user_input_massive[index_firstname];
                user_input_massive[index_firstname] = "0";
            }

            // Поиск Отчества
            index_surname = Validator.surNameSearch(user_input_massive);
            if (index_surname == 10) {
                throw new NoFIOException();
            } else {
                surname = user_input_massive[index_surname];
                user_input_massive[index_surname] = "0";
            }

            String[] full_info = new String[]{lastname, firstname, surname, data, Long.toString(phone_number), gender};
            writer(full_info);
        }
    }

    /**
     * Запись полученных валидных данных в файл
     * */
    public static void writer(String[] info) {
        try (FileWriter writer = new FileWriter(String.format("%s.txt", info[0]), true)) {
            writer.write(String.format("%s %s %s %s %s %s\n", info[0], info[1], info[2], info[3], info[4], info[5]));
            writer.flush();
            System.out.printf("%s %s %s успешно добавлен в базу\n", info[0], info[1], info[2]);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

