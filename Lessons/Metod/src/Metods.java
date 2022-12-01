public class Metods {
    public static void main(String[] args) {
      Person student = new Person();
      student.age=35;
      student.nume="Alex";
      student.student();
      int age1= student.calculateYearsToRetiremant();
      System.out.println("Ani ramasi pina la pensie " + age1 +" ani");
    }
}
class Person {
    String nume;
    int age;

    //Metoda care nu primeste nici un parametru si  nimic nu returneaza
    void student() {
        System.out.println("Numele " + nume + "\nVirsta "+ age +" ani!");
    }
    //Metoda care returneaza parametrii metodii
     int calculateYearsToRetiremant(){
      int years=75-age;
        return years;
    }
}
