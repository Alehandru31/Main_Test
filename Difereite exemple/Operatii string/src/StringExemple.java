import java.util.Locale;

public class StringExemple {
    public static void main(String[] args) {
        //Din litere mici in mari si invers
        String txt="Hello";
        String nume="Alex invata programare";
        System.out.println(txt.toLowerCase()); //Scrie toate literere cu litere mici
        System.out.println(txt.toUpperCase()); //Scrie toate literele mari
        System.out.println(txt.isBlank());
        System.out.println(txt.concat(nume));// Returneaza cite litere sau spatii adunate impreuna pina la inceputul civuntului din parateza intro fraza
        System.out.println(txt.charAt(3)); //Returnează caracterul la indexul specificat (poziția)
        System.out.println(txt.intern()); //Returneaza cuvintul
        System.out.println(txt.toString()); //Returneaza cuvintul
        System.out.println(txt.indexOf("o")); //Returneaza pozitiea literei 0 in cuvint sau fraza
        System.out.println(nume.length()); //Returneaza numarul de caractere in fraza inclusiv cu spatii
        System.out.println(nume.startsWith("A")); //Se verifica cu care litera se incepe fraza

        //Calculam toate literele in fraza nume.


    }
}
