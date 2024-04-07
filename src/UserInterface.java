public class UserInterface {
    public static String giveMeInfo() {
        return "\nВведите: Фамилию, Имя, Отчество, Дату рождения (в формате дд.мм.гггг)," +
                "Номер телефона (11-значное число через восьмёрку) и ваш пол (f или m) через пробел:";
    }

    public static String exitProgramMessage() {
        return "Завершаю работу приложения.";
    }

    public static String incorrectValueMessage() {
        return "Пожалуйста выберите один из предложенных пунктов.";
    }

    public static String firstMenu() {
        return """               
                1. Добавить нового человека в базу.
                2. Завершить работу приложения.
                Выберите интересующий пункт меню:""";
    }
}