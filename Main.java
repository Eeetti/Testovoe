
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Введите математическое выражение в формате два операнда и один оператор, через пробелы");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] str1 = str.split(" ");

        if ((str1.length != 3) ){
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию\n" +
                        " - два операнда и один оператор, через пробелы(Пример: 2 + 2) (+, -, /, *)");
                System.exit(-1);
            }
        }
        try {
            int one = Integer.parseInt(str1[0]);
            int two = Integer.parseInt(str1[2]);
        } catch (NumberFormatException e) {
            System.out.println("throws Exception //т.к. Числа должны быть целыми");
            System.exit(-2);
        }

        int one = Integer.parseInt(str1[0]);
        int two = Integer.parseInt(str1[2]);

        if ((one > 10 || one < 1) || (two > 10 || two < 1)) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("throws Exception //т.к. Числа не могут быть меньше 1 или больше 10");
                System.exit(-3);
            }
        }

        switch (str1[1]) {
            case "+":
                System.out.println(Integer.parseInt(str1[0]) + Integer.parseInt(str1[2]));
                break;
            case "-":
                System.out.println(Integer.parseInt(str1[0]) - Integer.parseInt(str1[2]));
                break;
            case "*":
                System.out.println(Integer.parseInt(str1[0]) * Integer.parseInt(str1[2]));
                break;
            case "/":
                System.out.println(Integer.parseInt(str1[0]) / Integer.parseInt(str1[2]));
                break;
            default:
                System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию\n" +
                        " - два операнда и один оператор, через пробелы(Пример: 2 + 2) (+, -, /, *)");
                System.exit(-4);
        }

    }
}
