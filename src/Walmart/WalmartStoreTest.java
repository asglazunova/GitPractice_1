package Walmart;

import java.util.ArrayList;
import java.util.List;

public class WalmartStoreTest {
    public static void main(String[] args) {

        List<Item> list = new ArrayList<>();
        list.add(new Item ("cucumber", 2.0,10));
        list.add(new Item("potato", 1.0,15));

        WalmartStore st1 = new WalmartStore("NY", list);
        System.out.println(st1.totalWorth);

        List<Item> newList = new ArrayList<>();
        newList.add(new Item ("cucumber", 1.5,20));
        newList.add(new Item("potato", 1.0,30));
        newList.add(new Item ("potato",0.5,40));
        newList.add(new Item("reddish", 3.0,5));
        st1.restockInventory(newList);
        System.out.println(st1.totalWorth);

        st1.inventory.forEach(i -> System.out.println(i));


    }
}
