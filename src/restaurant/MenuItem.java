package restaurant;

/*
Design:

Fields:
Price - BigDecimal - contains cost of menuItem
Description - String
Category - String
isNew - boolean
 */

import java.math.BigDecimal;

public class MenuItem {
    public String name;
    public BigDecimal price;
    public String description;
    public String category;
    public boolean isNew;

    public MenuItem(String name, BigDecimal price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;
    }




}
