package Exceptions;

public class WrongAmountOfDataException extends MyException {
    private final int amountOfData;

    public int getAmountOfData() {
        return amountOfData;
    }

    public WrongAmountOfDataException(int amountOfData) {
        super("Неверное количество введенных данных");
        this.amountOfData = amountOfData;
    }
}
