//Наследование в классах
//Aici are loc constructiea clasei Crw si transmitem metodei set si get 2 parametri.
//Apoi vizivaem metoda bureonca

public class Main {
    public static void main(String[] args) {
        Cow burenka = new Cow("Muuuu", 25); // Rezervam memorie pentru crearea clasei de crw si se da denumirea de burenka
        Ciinele bobic = new Ciinele("Muhtar", "Ham Ham");
        burenka.mu();      // Se cheama metoda mu cre se afla in cow
        bobic.latra();
    }
}