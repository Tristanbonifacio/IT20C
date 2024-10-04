import java.util.ArrayList;

class ItemManager {
    private ArrayList<String> items;

    public ItemManager() {
        items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
        System.out.println("\"" + item + "\" has been added.");
    }

    public void removeItem(String item) {
        if (items.remove(item)) {
            System.out.println("\"" + item + "\" has been removed.");
        } else {
            System.out.println("Item \"" + item + "\" not found.");
        }
    }

    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("No items in the list.");
        } else {
            System.out.println("Items in the list (" + items.size() + " total):");
            for (String item : items) {
                System.out.println(" - " + item);
            }
        }
    }
}
