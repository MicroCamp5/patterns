package pl.comarch.microcamp.patterns.state;

import pl.comarch.microcamp.patterns.strategy.PaymentExecutor;

public interface BucketState {
    void newPosition(BucketItem e) ;

    BucketState accept(String provider) ;

    BucketState pay(PaymentExecutor paymentExecutor) ;
}
