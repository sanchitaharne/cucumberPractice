package org.cucumber.learning;

import java.util.ArrayList;

public class RestaurantMenu {

    ArrayList<RestaurantMenuItem> items = new ArrayList<RestaurantMenuItem>();
    public void add(RestaurantMenuItem newMenuItem) {

        items.add(newMenuItem);
    }

    public boolean isExist(RestaurantMenuItem newMenuItem) {
        boolean flag=false;
        if (items.contains(newMenuItem))
            flag=true;
        return flag;
    }
}
