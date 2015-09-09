package Creational.Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zero on 15-8-31.
 */
public class Meal {
    private List<Item> mItems = new ArrayList<Item>();

    public void addItem(Item item) {
        mItems.add(item);
    }

    public float getTotalCost(){
        float cost = 0.0f;
        for (Item item : mItems) {
            cost += item.price();
        }
        if (cost < 0) {
            cost = 0;
        }
        return cost;
    }

    public void showItems(){
        for (Item item : mItems) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
