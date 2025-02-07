package pl.comarch.microcamp.patterns;

import pl.comarch.microcamp.patterns.strategy.BlikPaymentProvider;
import pl.comarch.microcamp.patterns.strategy.P24PaymentProvider;
import pl.comarch.microcamp.patterns.strategy.PaymentExecutor;

import java.util.ArrayList;

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
    PaymentExecutor paymentExecutor = new PaymentExecutor()
            .addProvider("BLIK", new BlikPaymentProvider())
            .addProvider("P24", new P24PaymentProvider());

    if (orderStatus == 2) {
      paymentExecutor.pay(items, provider);
    } else {
      System.out.println("Koszyk ma zły status");
    }
  }

}
