//Создание классов и объектов

public class Main {
    public static void main(String[] args) {
     Cars honda=new Cars();
     honda.setCars(250.05f, 2100, "Red", new byte[]{100,0,0});
    // honda.colors="Red";
   //  honda.weight=2100;
    // honda.speed=250.05f;
   //  honda.coordinate=new byte[]{100,0,0};

     Cars bmw=new Cars();
     bmw.setCars(300.5f, 1800,"Black", new byte[]{0,10,120});
    // bmw.speed=300.5f;
    // bmw.weight=1800;
    // bmw.colors="Black";
    // bmw.coordinate=new byte[]{0,10,120};

     System.out.println(bmw.getCars());
     System.out.println(honda.getCars());
    }
}