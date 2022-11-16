import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> numer=new LinkedList<>();
        numer.add(4);
        numer.add(7);
        numer.add(2);
        numer.add(8);
        numer.add(0);
        numer.add(3);
        numer.add(9);
        float sum=0;
        for (int i=0; i<numer.size(); i++)
            sum += numer.get(i);
        float delenie=sum/numer.size();
        for(int i=0; i< numer.size(); i++){
            if(delenie< numer.get(i)){
                System.out.println("El: " + numer.get(i));
            }
        }
    }
}
