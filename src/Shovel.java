import java.util.UUID;

public class Shovel extends Product{
    private ShovelSize size;
    private ShovelType type;


    public Shovel(String brandName, int quantity, UUID identifier, ShovelSize size, ShovelType type) {
        super(brandName, quantity, identifier);
        this.size = size;
        this.type = type;
    }
}
