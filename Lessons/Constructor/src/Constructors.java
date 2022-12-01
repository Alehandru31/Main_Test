public class Constructors {
    public static void main(String[] args) {
     Dog dog=new Dog(), dog1= new Dog("Tiger"),dog2= new Dog("Mifi", 4);
    }
}

class Dog{
    private String name;
    private int age;

    //Constructor care nu primeste nici un parametru
    public Dog(){
       this.name="Muhtar";
       this.age=3;
       bark();
    }
    //Constructor care primeste un parametru
   public Dog(String name){
       this.name=name;
       bark();
    }
    //Constructor care primeste doi parametri
    public Dog(String name, int age){
        this.name=name;
        this.age=age;
        bark();
    }
     //Sa creat o metoda
    void bark(){
        System.out.println("Ma numesc: "+name+ "\nAm "+ age + " ani!");
    }
}