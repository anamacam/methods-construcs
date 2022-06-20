package ar.com.ada.oop.instantiation;

import java.util.Date;

public class Bill {
    private static final double TAXES = 0.2;
    private long number;
    private String customer;
    private Date date;
    private BillItem[] items;
    private int lastAddedIndex;

    public Bill(long number, String customer, int billItemQuantity) {

        this.number = number;
        this.customer = customer;
        this.items = new BillItem[billItemQuantity];
        this.date = new Date();

    }

    public void addItem(Item item, int quantity) {
        BillItem billItem = new BillItem(item, quantity);
        if (lastAddedIndex < items.length) {
            items[lastAddedIndex] = billItem;
            lastAddedIndex++;


        }
    }
}