package pl.comarch.microcamp.patterns.strategy;

import pl.comarch.microcamp.patterns.state.BucketItem;

import java.util.List;

public interface PaymentProvider {
    void pay(List<BucketItem> items);
}
