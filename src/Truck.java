import java.util.UUID;

public class Truck extends Product{
    private int numberOfweels;


    public Truck(String brandName, int quantity, UUID identifier, int numberOfweels) {
        super(brandName, quantity, identifier);
        this.numberOfweels = numberOfweels;
    }
}
