public class Spatii {
    public static void main(String[] args) {
        int spatii=0;
        String text ="Afara earasi e iarna, Vintul bate incet incet. E frih si ninge peste dealuri."; //61 caractere
        for (int i = 0; i < text.length(); i++) {
            if(Character.isSpaceChar(text.charAt(i))) spatii++;
        }
        System.out.println(spatii);
    }
}
