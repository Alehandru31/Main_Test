public class Cow extends Animal{
    public  String nume="Alba";
    public Cow(String say, int teeth) { //Crem un constructor care va primi doi parametri
        setSay(say);              // parametrii primiti ii punem in variabila say prin metoda data
        setTeeth(teeth);          //  parametrii primiti ii punem in variabila teeth prin metoda data
    }

    @Override   //Se face pereapredelenie metoda
    public String getSay() {  //Se citeste informatia din say
        String s=super.getSay();// Se foloseste metoda super informatia obtinuta din metoda getSay se salveaza in s.
        return s+" Clasno!";    //Aici se face schimbarea sau returnarea la ambele informatii
    }

    void mu(){   //Metoda pentru vaca mu
        System.out.println(getSay()+" toate "+getTeeth()+" Dinti ");
    }
}
