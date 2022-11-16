//Создайте массив «ArrayList». Добавьте в него элементы:
//
//5.4, 6.2, 20.22, 1.001
//При помощи специального метода «get» выведите на экран первый и последний элементв формате:
// «Первый: first, второй: second», где first – первый элемент и second – последний элемент.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList <Double> numer=new ArrayList<>(4);
        numer.add(5.4);
        numer.add(6.2);
        numer.add(20.22);
        numer.add(1.001);
        System.out.println("Первый: " + numer.get(0) + ", второй: " + numer.get(numer.size()-1));

    }
}
