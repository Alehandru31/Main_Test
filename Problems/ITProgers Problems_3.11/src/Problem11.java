//Создайте метод «printCourse», что будет возвращать значение поля «course».
//
//Создайте объект класса «Study» и обратитесь к методу «printCourse» для вывода значения поля «course» в формате: «Value: name», где name - значение переменной.
public class Problem11 {
    public static void main(String[] args) {
    Study obj=new Study();
        System.out.print("Value: "+ obj.printCourse());
    }
}
