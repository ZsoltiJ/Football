public class Man extends Person {

    private Refrigerator refrigerator;


    public Refrigerator getRefrigerator() {

        return refrigerator;
    }

    public void setRefrigerator(Refrigerator ref) {

        refrigerator = ref;
    }

    public Man(String n, int a) {

        super(n, a);
        kidney = new Kidney();
    }

    public Kidney getKidney() {
        return kidney;
    }

    private Kidney kidney;

    public boolean Drinking(){
        try{
            Beer nowDrink = refrigerator.Remove();
            System.out.println("Drinking" + nowDrink.getBrand() + "beer");
            return true;
        }catch(IndexOutOfBoundsException e){
            System.out.println("No more beer!");
            return false;
        }


    }
    public void SwitchOnTv(Television television){
        television.switchOn();


    }
    public void SwitchOffTv(Television television){
        television.switchOff();
    }


}
