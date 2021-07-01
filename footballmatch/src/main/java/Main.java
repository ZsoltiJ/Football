public class Main {
    public static void main ( String[] args ) {
        Refrigerator refrigerator= new Refrigerator();
        Man man = new Man("Zsolt", 18);
        man.setRefrigerator(refrigerator);
        Television television = new Television();


        for (int i = 0; i <6 ; i++) {
            Beer beer = new Beer(5,"Soproni");
            refrigerator.Add(beer);
        }
        man.SwitchOnTv(television);
        boolean canDrink = true;
        while (canDrink){
            canDrink = man.Drinking();

        }
        man.SwitchOffTv(television);

    }

}
