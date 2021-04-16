import java.util.UUID;

public abstract class Product {
    private String  brandName;
    private int quantity;
    private UUID identifier;


    public Product(String brandName, int quantity, UUID identifier) {
        this.brandName = brandName;
        this.quantity = quantity;
        this.identifier = identifier;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getQuantity() {
        return quantity;
    }

    public UUID getIdentifier() {
        return identifier;
    }
}
