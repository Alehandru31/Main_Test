//Создайте массив «LinkedList». Добавьте в него элементы при помощи метода «add»:
//
//4, 7, 2
//За счет метода «set» установите значение 3 для элемента по индексу 1. Выведите на экран все элементы через цикл «for» в формате: «El: element», где element – значение элемента.
//
//Важно: при создании и выделении памяти под «LinkedList» не указывайте размерность вашего будущего массива.

import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList<Integer> numer=new LinkedList<>();
        numer.add(4);
        numer.add(7);
        numer.add(2);
        numer.set(1, 3);
        for(Integer i: numer) {
            System.out.println("El: " + i);
        }
    }
}
