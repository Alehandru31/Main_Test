import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(2);
        numbers.add(8);
        numbers.add(0);
        numbers.add(3);
        numbers.add(9);
        deleteElements(numbers);
    }

    public static void  deleteElements(LinkedList<Integer> input) {
        input.remove(4);
        input.remove(0);
        for (Integer obiectDinColectie : input ) {
            System.out.println("El: " + obiectDinColectie);
        }
    }
}