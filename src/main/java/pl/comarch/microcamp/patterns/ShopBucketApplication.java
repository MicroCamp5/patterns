package pl.comarch.microcamp.patterns;

import pl.comarch.microcamp.patterns.state.Bucket;
import pl.comarch.microcamp.patterns.state.BucketItem;
import pl.comarch.microcamp.patterns.state.BucketState;
import pl.comarch.microcamp.patterns.state.NewBucketState;
import pl.comarch.microcamp.patterns.strategy.BlikPaymentProvider;
import pl.comarch.microcamp.patterns.strategy.P24PaymentProvider;
import pl.comarch.microcamp.patterns.strategy.PaymentExecutor;


public class ShopBucketApplication {

  public static final PaymentExecutor PAYMENT_EXECUTOR = new PaymentExecutor()
          .addProvider("BLIK", new BlikPaymentProvider())
          .addProvider("P24", new P24PaymentProvider());

  public static void main(String[] args) {


    BucketState bucketState = new NewBucketState(new Bucket());
    String provider = "BLIK";

    BucketItem e = new BucketItem(1,"Pozycja 1",0.1d  );
    BucketItem e2 = new BucketItem(1, "Pozycja 2", 0.2d);

    bucketState.newPosition(e);
    bucketState.newPosition(e2);
    bucketState =  bucketState.accept(provider);

    bucketState = bucketState.pay(PAYMENT_EXECUTOR);

  }

}
