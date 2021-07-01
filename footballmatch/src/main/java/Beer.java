public class Beer {
    private String brand;
    private int quantity;

    public String getBrand () {
        return brand;
    }


    public int getQuantity () {
        return quantity;
    }


    public Beer(Integer quantity, String brand){
        this.quantity=quantity;
        this.brand=brand;
    }
}
