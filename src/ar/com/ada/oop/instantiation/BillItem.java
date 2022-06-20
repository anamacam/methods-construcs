package ar.com.ada.oop.instantiation;

public class BillItem {
    private Item item;
    private int quantity;

    public BillItem(Item item, int quantity){
        this.item = item;
        this.quantity = quantity;

    }

    public BillItem(Item item) {
        this.item = item;
    }

    public BillItem(int quantity) {
        this.quantity = quantity;
    }


}
