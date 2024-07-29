package day5;

import java.util.LinkedList;
import java.util.List;

class Cars {
    private String name;
    private float price;
    private int qty;

    public Cars(String name, float price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "\nname='" + getName() + '\'' +
                "\nprice=" + getPrice() +
                "\nqty=" + getQty() +
                "\n}";
    }
}

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Cars> carInfo = new LinkedList<>();

        carInfo.add(new Cars("Tesla", 3450.45f, 5));
        carInfo.add(new Cars("BMW", 56450.45f, 4));
        carInfo.add(new Cars("RR", 34950.45f, 7));
        carInfo.add(new Cars("Toyota", 9450.45f, 2));
        carInfo.add(new Cars("Supra", 9950.45f, 7));
        carInfo.add(new Cars("Bentley", 5099.45f, 5));

        System.out.println("Original Car List:");
        printList(carInfo);

        System.out.println("\nAfter removing last element:");
        carInfo.removeLast();
        printList(carInfo);
    }

    private static void printList(List<Cars> list) {
        for (Cars car : list) {
            System.out.println(car);
        }
    }
}
