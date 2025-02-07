package pl.comarch.microcamp.patterns.state;

import pl.comarch.microcamp.patterns.strategy.PaymentExecutor;

public class PayedBucketState implements BucketState {
    @Override
    public void newPosition(BucketItem e) {

    }

    @Override
    public BucketState accept(String provider) {
        return null;
    }

    @Override
    public BucketState pay(PaymentExecutor paymentExecutor) {
        throw new IllegalStateException("Can't pay in state Payed");

    }
}
