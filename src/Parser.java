public class Parser {
    /**
     * Парсер (убирает из текста лишние пробелы)
     * @param user_text введенный пользователем текст
     * @return Отформатированный текст
     */
    public static String pars(String user_text) {
        StringBuilder text = new StringBuilder(user_text.trim());
        String[] text_massive = text.toString().split("");
        text = new StringBuilder();
        text.append(text_massive[0]);
        for (int i = 1; i < text_massive.length; i++) {
            if (!(text_massive[i].equals(text_massive[i - 1]) && text_massive[i].equals(" "))) {
                text.append(text_massive[i]);
            }
        }
        return text.toString();
    }
}
