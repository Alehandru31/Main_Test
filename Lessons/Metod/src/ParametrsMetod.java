public class ParametrsMetod {
    public static void main(String[] args) {
        Persons person=new Persons();
        person.student("Alex", 35);
    }
}

class Persons{
   String nume;
    int age;
    //Metoda care primeste 2 parametri dar nu returneaza nimic
    void student(String name, int age){
        this.nume=name;
        this.age=age;
        System.out.println("Ma numesc " + name+ " si am " + age + " ani!");
    }
}