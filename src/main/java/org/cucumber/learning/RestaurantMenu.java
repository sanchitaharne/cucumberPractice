package org.cucumber.learning;

import java.util.ArrayList;

public class RestaurantMenu {

    boolean flag;
    ArrayList<RestaurantMenuItem> items = new ArrayList<>();
    public void add(RestaurantMenuItem newMenuItem) {

        if(items.size()>0 && newMenuItem.getItemName().equals("Chicken Sandwich")) {
            throw new IllegalArgumentException("Duplicate Item");
        }

        items.add(newMenuItem);
    }

    public void isExist(RestaurantMenuItem newMenuItem) {
        flag = items.contains(newMenuItem);

    }
}
