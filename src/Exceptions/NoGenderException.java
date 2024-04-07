package Exceptions;

public class NoGenderException extends MyException {
    public NoGenderException() {
        super("Некорректно введён пол");
    }
}
