package Exceptions;

public class NoFIOException extends MyException {
    public NoFIOException() {
        super("Некорректно введено ФИО");
    }
}
