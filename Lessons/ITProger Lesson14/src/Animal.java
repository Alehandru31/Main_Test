public class Animal {
    private String say=".....";  // Variabila de tip string
    private String nume="    ", latra;
    private int teeth=8;    // Peremenca de tit int

    public String getSay() {  //chemarea metodei getSay. Se citeste ce informatie se afla in variabila say
        return say;           //Se returneaza aceasta informatie acolo unde a fost ceruta acest metod
    }

    public void setSay(String say) { //Se primesc parametrii indicati in main
        this.say = say;              //Se scriu acest parametru in say
    }
    public void setNume(String nume){
        this.nume=nume;
    }

    public String getLatra() {
        return latra;
    }

    public void setLatra(String latra) {
        this.latra = latra;
    }

    public String getNume() {
        return nume;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teenth) {
        this.teeth = teenth;
    }
}
