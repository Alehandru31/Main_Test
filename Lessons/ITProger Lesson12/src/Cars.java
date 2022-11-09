public class Cars {
   private float speed;
    private int weight;
   private String colors;
    private byte[] coordinate;

    public void setCars(float speed, int weight, String colors, byte[] coordinate){
        this.colors=colors;
        this.weight=weight;
        this.speed=speed;
        this.coordinate=coordinate;
    }

    public String getCars(){
        String infoCoordinates = "Coordinats: ";
        for(int i = 0; i < coordinate.length; i++)
            infoCoordinates += coordinate[i] + ",";
        String info ="Car iz speed-:" +this.speed + ";\n " + "Massa iz- "+ this.weight +".\n" + "Colorss iz -" +this.colors +".\n";
        return info +infoCoordinates;
    }
}
