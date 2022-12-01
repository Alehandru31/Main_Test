public class Incapsuleatiia {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.setMark(" ");
        System.out.println(vehicle.getMark());
    }
}

class Vehicle{
   private String mark;
    private int numer;

    public void setMark(String mark) {
        if(mark.isEmpty()){
            System.out.println("erorr. Introduceti marca de masina");
        }
        else  if(mark.equals(' ')){
            System.out.println("erorr. Introduceti marca de masina");
        }
        else {
            this.mark = mark;
        }
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public String getMark() {
        return mark;
    }

    public int getNumer() {
        return numer;
    }

}