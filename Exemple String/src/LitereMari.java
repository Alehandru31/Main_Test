public class LitereMari {
    public static void main(String[] args) {

        String text ="Afara earasi e iarna, Vintul bate incet incet. 125444 [] {} E frih si ninge peste dealuri."; //61 caractere
        for (int i = 0; i < text.length(); i++) {
            if(Character.isUpperCase(text.charAt(i))) {
                System.out.println(text.charAt(i));
            }
        }
    }
}
