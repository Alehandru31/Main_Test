public class Ciinele extends Animal {
    public Ciinele(String nume, String latra){
        setNume(nume);
        setLatra(latra);
    }

    void latra(){
        System.out.println("Nume " + getNume() + "\nCiinele latra " +getLatra());
    }
}
