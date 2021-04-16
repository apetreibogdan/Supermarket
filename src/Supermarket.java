import java.util.ArrayList;
import java.util.List;

public class Supermarket {
    private List<Product> inventoryList = new ArrayList<>();
    private List<DiaryProduct> diaryProducts = new ArrayList<>();


    public Supermarket(List<Product> inventoryList) {
        this.inventoryList = inventoryList;
    }


    public void displayInventory() {
        for (Product product : inventoryList) {
            System.out.println(product.getBrandName());

        }
    }


    public List<Product> getProfitableProducts(Data1 data1) {
        List<Product> profitableProductsList = new ArrayList<>();
        for (Product product : inventoryList) {
            if ((product instanceof DiaryProduct) &&
                    ((((DiaryProduct) product).getExpirationDate().compareTo(data1) == 1) || (((DiaryProduct) product).getExpirationDate().compareTo(data1) == 0))) {
                profitableProductsList.add(product);
            }
        }
        return profitableProductsList;
    }

    public List<Product> getExpireProducts(Data1 data1) {
        List<Product> expireProducts = new ArrayList<>();
        for (Product product : inventoryList) {
            if ((product instanceof DiaryProduct) && ((DiaryProduct) product).getExpirationDate().compareTo(data1) == -1)
                ;
            expireProducts.add(product);
        }
        return expireProducts;
    }


}


//    Parent p = createObject();
//((Child1) p).child1SpecificMethod();