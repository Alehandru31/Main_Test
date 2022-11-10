 public class Cars {
   private float speed;
   private int weight;
    private String colors;
    private byte[] coordinate;
// Mai jos noi vedem constructor pentru Cars care primeste parametrii de la Honda
     public Cars(float speed, int weight, String colors, byte[] coordinate) { //se formeaza un constructor cu modificator dostupa public si primeste 4 parametri
         System.out.println("Honda: ");
         setCars(speed, weight, colors, coordinate); //apelam la setCar Unde instalam prin parametri speed, in palea clasa (this.speed) datele de la metod
         System.out.println(getCars()); //Citim setarile facute in getCars
     }
     public Cars(float speed, byte[] coordinate){
         System.out.println("Bmw: ");
         this.speed=speed;
         this.coordinate=coordinate;
         System.out.println(getCars());
     }

     public void setCars(float speed, int weight, String colors, byte[] coordinate){
        this.colors=colors;
        this.weight=weight;
        this.speed=speed;
        this.coordinate=coordinate;
    }

    public String getCars(){
         String infocoordinate="Coordonats: \n";
         for (int i=0; i<coordinate.length; i++)
             infocoordinate +=coordinate[i]+"\n";
        String info ="Car iz speed-:" +this.speed + ";\n " + "Massa iz- "+ this.weight +".\n" + "Colorss iz -" +this.colors +".\n";
        return info+infocoordinate;
    }
}
