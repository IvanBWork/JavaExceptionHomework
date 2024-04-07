import Exceptions.WrongAmountOfDataException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    /**
     * Проверка введенных данных на валидность
     * @param s массив строк
     * @throws WrongAmountOfDataException ошибка неверного количества данных
     */
    public static void amountOfDataExamination(String[] s) throws WrongAmountOfDataException {
        if (s.length != 6) {
            if (s.length == 1 && s[0].equals("")) {
                throw new WrongAmountOfDataException(0);
            }
            throw new WrongAmountOfDataException(s.length);
        }
    }

    /**
     * Находит в массиве дату, соответствующую необходимому формату
     * @param s переданный массив с информацией
     * @return Индекс даты в массиве
     */
    public static int dataSearch(String[] s) {
        String regex = "^[0-9][0-9]\\.[0-9][0-9]\\.19[0-9][0-9]$";
        int index_data = 10;
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < s.length; i++) {
            Matcher matcher = pattern.matcher(s[i]);
            if (matcher.matches()) {
                index_data = i;
            }
        }
        return index_data;
    }

    /**
     * Находит в массиве номер телефона, соответствующий необходимому формату
     * @param s переданный массив с информацией
     * @return Индекс номера телефона в массиве
     */
    public static int phoneSearch(String[] s) {
        String regex = "^8[1-9][1-9][1-9][1-9][1-9][1-9][1-9][1-9][1-9][1-9]$";
        int index_phone_number = 10;
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < s.length; i++) {
            Matcher matcher = pattern.matcher(s[i]);
            if (matcher.matches()) {
                index_phone_number = i;
            }
        }
        return index_phone_number;
    }

    /**
     * Находит в массиве пол человека
     * @param s переданный массив с информацией
     * @return Индекс пола человека в массиве
     */
    public static int genderSearch(String[] s) {
        int index_gender = 10;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equalsIgnoreCase("f") || s[i].equalsIgnoreCase("m")) {
                index_gender = i;
            }
        }
        return index_gender;
    }

    /**
     * Находит в массиве Фамилию
     * @param s переданный массив с информацией
     * @return Индекс фамилии в массиве
     */
    public static int lastNameSearch(String[] s) {
        String regex = "^[A-Za-zА-Яа-я]+$";
        int index_lastname = 10;
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < s.length; i++) {
            Matcher matcher = pattern.matcher(s[i]);
            if (matcher.matches()) {
                index_lastname = i;
                return index_lastname;
            }
        }
        return index_lastname;
    }

    /**
     * Находит в массиве Имя
     * @param s переданный массив с информацией
     * @return Индекс имени в массиве
     */
    public static int firstNameSearch(String[] s) {
        String regex = "^[A-Za-zА-Яа-я]+$";
        int index_firstname = 10;
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < s.length; i++) {
            Matcher matcher = pattern.matcher(s[i]);
            if (matcher.matches()) {
                index_firstname = i;
                return index_firstname;
            }
        }
        return index_firstname;
    }

    /**
     * Находит в массиве Отчество
     * @param s переданный массив с информацией
     * @return Индекс отчества в массиве
     */
    public static int surNameSearch(String[] s) {
        String regex = "^[A-Za-zА-Яа-я]+$";
        int index_surname = 10;
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < s.length; i++) {
            Matcher matcher = pattern.matcher(s[i]);
            if (matcher.matches()) {
                index_surname = i;
                return index_surname;
            }
        }
        return index_surname;
    }
}
