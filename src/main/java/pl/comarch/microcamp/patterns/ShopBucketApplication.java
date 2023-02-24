package pl.comarch.microcamp.patterns;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ShopBucketApplication {

  public static void main(String[] args) {

    ArrayList<BucketItem> items = new ArrayList<>();
    int orderStatus = 1;
    String provider = "BLIK";

    BucketItem e = new BucketItem();
    e.name = "Pozycja 1";
    e.no = 1;
    e.price = 0.1d;
    items.add(e);

    BucketItem e2 = new BucketItem();
    e2.name = "Pozycja 2";
    e2.no = 1;
    e2.price = 0.2d;
    items.add(e);

    orderStatus = 2;

    if (orderStatus == 2) {
      if (provider == "BLIK") {
        System.out.println(
            "Operacja płatności BLIK "
                + items.stream().map(i -> i.price).collect(Collectors.summingDouble(a -> a)));
      } else if (provider == "P24") {
        System.out.println(
            "Operacja płatności P24 "
                + items.stream().map(i -> i.price).collect(Collectors.summingDouble(a -> a)));
      }
    } else {
      System.out.println("Koszyk ma zły status");
    }
  }

  private static class BucketItem {
    int no;
    String name;

    int value;

    double price;
  }
}
