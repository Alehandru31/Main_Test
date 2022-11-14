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