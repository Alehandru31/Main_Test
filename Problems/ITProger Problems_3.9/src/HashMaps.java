//Создайте список данных на основе класса «HashMap». Добавьте в него ключи и значения, что представлены ниже:
//
//"name": "Alex",
//"age": "45",
//"hobby": "football"
//Выведите все элементы на экран в формате: «Ключ: key. Значение: value», где key – ключ элемента, а value – значение элемента.

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
public static void main (String[] args) {
    // Создаем список данных
    Map<String, String> numbers = new HashMap<>();

    // Помещаем данные на карточку
    numbers.put("name", "Alex");
    numbers.put("age", "45");
    numbers.put("hobby", "football");

    // Для получения ключей и значений
    // нужно использовать Map.Entry и
    // метод entrySet()
    for (Map.Entry i : numbers.entrySet()) {
        System.out.println("Ключ: " + i.getKey() + ". Значение: "
                + i.getValue());
    }
    //for (Map.Entry i: numbers.entrySet()){
    //        System.out.println("Ключ: " + i.getKey() +" Значение: " + i.setValue(i));
    //    }
}
}
