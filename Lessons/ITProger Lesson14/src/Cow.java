public class Cow extends Animal{
    public Cow(String say, int teeth) {
        setSay(say);
        setTeeth(teeth);
    }

    @Override
    public String getSay() {
        String s=super.getSay();
        return s+" Clasno!";
    }

    void mu(){
        System.out.println(getSay()+" toate "+getTeeth()+" Dinti ");
    }
}
