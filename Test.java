package task7;

import java.util.Arrays;

public class Test {

    public static void main(String[] args){
        ProductType.testMe();
        System.out.println();

        Item[] exampleItems = { // CREATE AN ARRAY WITH 3 REFERENCES TO THE ITEM OBJECTS
            new Item(ProductType.MILK, 5, "This is milk"),
            new Item(ProductType.BREAD, 3),
            new Item(ProductType.BUTTER)
        };

        Item[] items = new Item[3];
        System.arraycopy(exampleItems, 0, items, 0, exampleItems.length); 
     // Create an array of 3 Items and fill it with objects created above
        System.out.println("Printing array of objects created above: ");
        System.out.println(Arrays.toString(items));
        System.out.println();

        Item testItem = new Item(ProductType.TEA, -1, "Non negative tea");
        System.out.println("Try to create item with negative quantity (-1), has default quantity 1: \n" + testItem);
        System.out.println();

        testItem = new Item(ProductType.TEA, 21, "Non negative tea");
        System.out.println("Try to create item with quantity = 21, has default quantity 1: \n" + testItem);
        System.out.println();

        testItem.removeComment();

        testItem.addItems(21);
        System.out.println("Try to add 21 items (removed comment for readability): " + testItem);
        System.out.println();

        testItem.addItem();
        System.out.println("Add item: " + testItem);
        System.out.println();

        testItem.addItems(18);
        System.out.println("Add 18 items: " + testItem);
        System.out.println();

        testItem.addItem();
        System.out.println("Add item when quantity is 20: " + testItem);
        System.out.println();

        testItem.remove(10);
        System.out.println("Remove 10 items: " + testItem);
        System.out.println();

        testItem.remove(10);
        System.out.println("Try to remove another 10 items: " + testItem);
        System.out.println();

        System.out.println("Get quantity: " + testItem.getQuantity());
        System.out.println();

        System.out.println("Get total weight: " + testItem.getTotalWeight());
        System.out.println();

        System.out.println("toString: \n" + testItem.toString());
        testItem.setComment("Green tea");
        System.out.println("toString with comment: \n" + testItem.toString());
        System.out.println();

        Item compareItem1 = new Item(ProductType.BUTTER, 10);
        Item compareItem2 = new Item(ProductType.TEA, 10, "Different comment");
        System.out.println("Check if item " + compareItem1 + " is equal to " + testItem);
        System.out.println(compareItem1.equals(testItem));
        System.out.println();
        System.out.println("Check if item " + compareItem2 + " is equal to " + testItem);
        System.out.println(compareItem2.equals(testItem));

    }
}
