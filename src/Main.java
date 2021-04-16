import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Date data;
        List<Product> inventoryList = new ArrayList<>();


        Shovel lopata1 = new Shovel("China Style", 1, UUID.randomUUID(), ShovelSize.BIG, ShovelType.STEEL);
        Shovel lopata2 = new Shovel("India Style", 1, UUID.randomUUID(), ShovelSize.SMALL, ShovelType.PLASTIC);
        Shovel lopata3 = new Shovel("No Style", 1, UUID.randomUUID(), ShovelSize.NORMAL, ShovelType.ALUMINIUM);
        inventoryList.add(lopata1);
        inventoryList.add(lopata2);
        inventoryList.add(lopata3);

        Truck volvo = new Truck("Volvo", 1, UUID.randomUUID(), 7);
        inventoryList.add(volvo);


        LongLastingMilk danone = new LongLastingMilk("Danone", 1, UUID.randomUUID(), new Data1(2021, 9));
        LongLastingMilk danone1 = new LongLastingMilk("Danone1", 1, UUID.randomUUID(), new Data1(2021, 4));
        LongLastingMilk danone2 = new LongLastingMilk("Danone2", 1, UUID.randomUUID(), new Data1(2020, 1));
        inventoryList.add(danone);
        inventoryList.add(danone1);
        inventoryList.add(danone2);

        RegularMilk milka = new RegularMilk("Milka", 1, UUID.randomUUID(), new Data1(2021, 9, 6));
        RegularMilk milka1 = new RegularMilk("Milka1", 1, UUID.randomUUID(), new Data1(2021, 4, 15));
        RegularMilk milka2 = new RegularMilk("Milka2", 1, UUID.randomUUID(), new Data1(2020, 9, 6));
        inventoryList.add(milka);
        inventoryList.add(milka1);
        inventoryList.add(milka2);

        Supermarket aldis = new Supermarket(inventoryList);

        aldis.displayInventory();
        aldis.getProfitableProducts(new Data1(2021,4,15));
    }

}

