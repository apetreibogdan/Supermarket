import java.util.UUID;

public class DiaryProduct extends Product{
    private Data1 expirationDate;

    public DiaryProduct(String brandName, int quantity, UUID identifier, Data1 expirationDate) {
        super(brandName, quantity, identifier);
        this.expirationDate = expirationDate;

    }

    public Data1 getExpirationDate() {
        return expirationDate;
    }
}
