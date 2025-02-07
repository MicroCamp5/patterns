package pl.comarch.microcamp.patterns.state;

import pl.comarch.microcamp.patterns.strategy.PaymentExecutor;

public class NewBucketState implements BucketState {
    private final Bucket bucket;

    @Override
    public void newPosition(BucketItem e) {
        bucket.add(e);
    }

    @Override
    public BucketState accept(String provider) {
        return new AcceptedBucketState(bucket, provider);
    }

    @Override
    public BucketState pay(PaymentExecutor paymentExecutor) {
        throw new UnsupportedOperationException();
    }

    public NewBucketState(Bucket bucket) {
        this.bucket = bucket;
    }
}
