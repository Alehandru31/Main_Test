//Создайте функцию «getElementsOfArray», что будет принимать в качестве параметра массив данных.
//
//Выполните вызов функции и передачу в неё следующего массива:
//
//5, 7, 8, 10
//
//Функция должна вывести на экран массив в формате: «5 / 10». То есть выводиться первый и последний элемент массива.

public class Main {
    public static void main(String[] args) {
       int[] arr =new int[]{5, 7, 8, 10};
        getElementsOfArray(arr);
    }
    public static void getElementsOfArray(int[] numer){
        System.out.println(numer[0]+"/"+numer[numer.length-1]);
        System.out.println("Alex");
    }
}
