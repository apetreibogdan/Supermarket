import java.util.UUID;

public class LongLastingMilk extends DiaryProduct{



    public LongLastingMilk(String brandName, int quantity, UUID identifier, Data1 expirationDate) {
        super(brandName, quantity, identifier,expirationDate);
    }

    @Override
    public Data1 getExpirationDate() {
        return super.getExpirationDate();
    }

    @Override
    public String getBrandName() {
        return super.getBrandName();
    }

    @Override
    public int getQuantity() {
        return super.getQuantity();
    }

    @Override
    public UUID getIdentifier() {
        return super.getIdentifier();
    }
}