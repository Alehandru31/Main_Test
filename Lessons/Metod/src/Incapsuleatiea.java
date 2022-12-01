public class Incapsuleatiea {
    public static void main(String[] args) {
        Person1 person = new Person1();
        person.setNume("Alex");
        person.setAge(2);
        System.out.println(person.getNume() + " " +person.getAge());
    }
}
class Person1{
    private String nume;
    private int age;

    public void setNume(String userNume) {
        if (userNume.isBlank()) //isEmpty- returneaza true daca numele e gol si false daca nu e gol
        {
            System.out.println("Nu exista nume: ");
        }
        else
        {
            this.nume = userNume;
        }
    }
    public void setAge(int age) {
        if(age <0){
            System.out.println("Este un numar mai mic ca zero: Introduceti virsta.");
        }
        else {
            this.age = age;
        }
    }
    public String getNume() {
        return nume;
    }

    public int getAge() {
        return age;
    }
}
