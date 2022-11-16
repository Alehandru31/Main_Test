//Создайте функцию «divideAndRound», что будет принимать в качестве параметров три числа.
//
//В функции проводите деление чисел.
//
//Полученное число должно быть округлено к большему и возвращено из функции.
//
//Выполните вызов функции, передачу в неё чисел «500.05, 2.25, 3.01» и вывод результата на экран в формате: «Результат: res», где res – это результат деления.
//
//Подсказка: класс Math работает с типом данных double, поэтому переменные лучше создавать с этим типом.
public class Main {
    public static void main(String[] args) {
        divideAndRound( 500.05d,2.25d,3.01d);
    }

    public static double divideAndRound(double a, double b, double c) {
        double divide=Math.ceil(a/b/c);
        System.out.println("Результат: " + divide);
        return divide ;
    }
}