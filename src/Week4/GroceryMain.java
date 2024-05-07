package Week4;

public class GroceryMain {
    public static void main(String[] args) {
        // Create grocery object items;
        // Add the grocery items to the grocery list;
        // Generate a report of the grocery list including item description,
        // prices and total price. (You will likely need to write a new method to output the shopping list)
        GroceryList2 list = new GroceryList2();
        GroceryItemOrder2 apples = new GroceryItemOrder2("apples", 2, 3);
        GroceryItemOrder2 bananas = new GroceryItemOrder2("bananas", 1, 6);
        GroceryItemOrder2 cherries = new GroceryItemOrder2("cherries", 5, 5);
        GroceryItemOrder2 avocados = new GroceryItemOrder2("avocados", 4, 4);
        GroceryItemOrder2 garlic = new GroceryItemOrder2("garlic", 3, 3);

        list.add(apples);
        list.add(bananas);
        list.add(cherries);
        list.add(avocados);
        list.add(garlic);

        list.displayItems();


    }
}
