public class Main {
    public static void main(String[] args) {
//        int numCaracters = 0, virgula=0, punct=0;
       String text ="Afara earasi e iarna, Vintul bate incet incet. E frih si ninge peste dealuri. "; //61 caractere

//        //1. Calculam cite caractere avem in fraza
//        for (int i = 0; i <text.length() ; i++) {
//            if (text.charAt(i) == ' ' || text.charAt(i) == '.' || text.charAt(i) == ',') {
//                //Se verifica cite virgule sunt
//                if(text.charAt(i)==',')
//                    virgula++;
//                //Se verifica cite puncte avem
//                if(text.charAt(i)=='.')
//                    punct++;
//              continue;
//            }
//            numCaracters++;
//        }
//        System.out.println("Numarul de caractere fara spatiu: " + numCaracters);
//        System.out.println("Virgule sunt: " + virgula + " Puncte sunt: " + punct);

//2. Cite cifre mari si mici avem
      char[] simbol =text.toCharArray();
        for (int i = 0; i <simbol.length ; i++)
            System.out.println(simbol[i]);
    }

}