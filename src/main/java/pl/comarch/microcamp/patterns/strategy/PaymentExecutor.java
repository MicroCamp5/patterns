package pl.comarch.microcamp.patterns.strategy;

import pl.comarch.microcamp.patterns.BucketItem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentExecutor {
    private final Map<String, PaymentProvider> providerMap = new HashMap<>();

    public void pay(List<BucketItem> items, String providerKey){
     if (providerMap.containsKey(providerKey)){
          providerMap.get(providerKey).pay(items);
     }
     throw  new IllegalStateException("Unexpected provider key: " + providerKey);
    }
    public PaymentExecutor addProvider(String key, PaymentProvider provider){
        providerMap.put(key, provider);
        return this;
    }
}
