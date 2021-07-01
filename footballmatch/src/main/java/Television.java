public class Television {

    private TvStatus status;


    public void switchOn(){
        if(status != TvStatus.SWITCHED_ON) {
            status = TvStatus.SWITCHED_ON;
            System.out.println("TV is on!");
        }
    }
    public void switchOff(){
        if( status != TvStatus.SWITCHED_OFF) {
            status = TvStatus.SWITCHED_OFF;
            System.out.println("TV is off!");
        }
    }




}
