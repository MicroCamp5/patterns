package pl.comarch.microcamp.patterns.state;

import pl.comarch.microcamp.patterns.strategy.PaymentExecutor;

public class AcceptedBucketState implements BucketState {
    private final Bucket bucket;
    private final String provider;

    public AcceptedBucketState(Bucket bucket, String provider) {
        super();
        this.bucket = bucket;
        this.provider = provider;
    }

    @Override
    public void newPosition(BucketItem e) {

    }

    @Override
    public BucketState accept(String provider) {
        return this;
    }

    @Override
    public BucketState pay(PaymentExecutor paymentExecutor) {
        paymentExecutor.pay(bucket.items, provider);
        return new PayedBucketState();
    }
}
