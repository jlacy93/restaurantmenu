package restaurant;
import java.util.ArrayList;
import java.util.Date;

/*
Design:

Fields:
lastModifiedDate - Date()
ArrayList<MenuItem>
 */
public class Menu {
    public String lastModifiedDate = String.valueOf(new Date());
    public ArrayList<MenuItem> menuItems;

}

