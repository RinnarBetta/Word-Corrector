package app;

public class Main {

    public static void main(String[] args) {
        Corrector corrector = new Corrector();

        // Получаем данные от DataProvider
        String[] data = new DataProvider().getData();

        // Обрабатываем данные и выводим результат
        getOutput(corrector.handleData(data));
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}