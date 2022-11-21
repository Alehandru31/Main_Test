//Допишите в класс «Study» конструктор, что будет принимать один параметр и будет устанавливать значение этого параметра в поле «course».
//
//Создайте объект класса «Study». В качестве значения для поля «course» установите текст: «Изучение Java - это просто!». Обратитесь к методу «printCourse» для вывода значения поля «course».

public class Problems12 {
    public static void main(String[] args) {
     Study study=new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());
    }
}