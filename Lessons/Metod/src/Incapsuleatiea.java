public class Incapsuleatiea {
    public static void main(String[] args) {
        Person1 person = new Person1();
        person.setNume(" ");
        person.setAge(-3);
    }
}
class Person1{
    private String nume;
    private int age;

    public void setNume(String userNume) {
        if (userNume.isEmpty() || userNume.equals(' ')) //isEmpty- returneaza true daca numele e gol si false daca nu e gol
        {
            System.out.println("Nu exista nume: ");
        }
        else
        {
            this.nume = userNume;
        }
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getNume() {
        return nume;
    }

    public int getAge() {
        return age;
    }
}
