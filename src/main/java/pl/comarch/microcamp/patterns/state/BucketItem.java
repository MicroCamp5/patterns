package pl.comarch.microcamp.patterns.state;

import lombok.Getter;

@Getter
public class BucketItem {
    public BucketItem(int no, String name, double price) {
        this.no = no;
        this.name = name;
        this.price = price;
    }

    int no;
    String name;

    double price;
}
