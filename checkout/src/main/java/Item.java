public class Item {

    String name;
    int price;

    public Item(String name, int price) {

        this.name = name;
        this.price = price;

    }

    public static void main(String[] args) {

        Item itemA = new Item("a", 50);
        Item itemB = new Item("b", 30);
        Item itemC = new Item("c", 20);
        Item itemD = new Item("d", 15);


    }


}
