package pl.comarch.microcamp.patterns.strategy;

import pl.comarch.microcamp.patterns.state.BucketItem;

import java.util.List;
import java.util.stream.Collectors;

public class P24PaymentProvider implements PaymentProvider {
    @Override
    public void pay(List<BucketItem> items) {
        System.out.println(
                "Operacja płatności P24 "
                        + items.stream().map(i -> i.getPrice()).collect(Collectors.summingDouble(a -> a)));
    }
}
