package guru.qa;

public class Main {
    public static void main(String[] args) {
        int a = 5, b = 4;
        double d = 5.5;
        byte overFlow = 127;

        //0) применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
        System.out.println("Сложение a + b = " + (a + b));
        System.out.println("Вычитание a - b = " + (a - b));
        System.out.println("Умножение a * b = " + (a * b));
        System.out.println("Целочисленное деление a/b = " + (a / b));

        //1) применить несколько арифметических операций над int и double в одном выражении
        System.out.println("\nint * double - int = " + (a * d - b));
        System.out.println("int / int - double = " + (a / b - d));

        //2) применить несколько логических операций ( < , >, >=, <= )
        System.out.println("\na < b = " + (a < b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= d = " + (a <= d));

        //3) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой
        // (какие максимальные и минимальные значения есть, как их получить) и переполнение
        System.out.println("\nМаксимальное значение float = " + Float.MAX_VALUE);
        System.out.println("Минимальное значение float = " + Float.MIN_VALUE);
        System.out.println("Максимальное значение double = " + Double.MAX_VALUE);
        System.out.println("Минимальное значение double = " + Double.MIN_VALUE);

        //4) получить переполнение при арифметической операции
        overFlow++;
        System.out.println("\nПереполнение при арифметической операции: byte.MAX_VALUE + 1 =" + overFlow);

    }
}