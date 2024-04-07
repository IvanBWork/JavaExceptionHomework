package Exceptions;

public class NoPhoneException extends MyException {
    public NoPhoneException() {
        super("Некорректно введён номер телефона");
    }
}
