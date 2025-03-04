package item;
import java.util.ArrayList;
import java.util.List;
public class ItemManager {
    private List<item.Item> items = new ArrayList<>();
    public void addItem(item.Item item) {
        items.add(item);
    }
