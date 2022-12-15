public class Main {
    public static void main(String[] args) {

        try {
            int a=10/0;
        }catch (ArithmeticException e){
            System.out.println("Error "+e);
        }finally {
            System.out.println("Aceasta fraza se indica la sfirsit indiferent de rezultatul excluderei");
        }
    }
}