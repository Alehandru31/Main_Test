//Создайте массив «ArrayList». Добавьте в него элементы:
//
//5, 6, 20, 1
//При помощи цикла «for» выведите все элементы на экран в формате:
// «El: element», где element – значение элемента.
import java.util.ArrayList;

public class Main {
public static void main(String[] args){
  ArrayList<Integer> numer=new ArrayList<>();
  numer.add(5);
  numer.add(6);
  numer.add(20);
  numer.add(1);
 for(int i: numer)
   System.out.println("El: "+i);
}
}

