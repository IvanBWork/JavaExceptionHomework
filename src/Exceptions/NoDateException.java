package Exceptions;

public class NoDateException extends MyException {
    public NoDateException() {
        super("Некорректно введена дата рождения");
    }
}
