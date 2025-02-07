package pl.comarch.microcamp.patterns.state;

import java.util.ArrayList;
import java.util.List;

public class Bucket {
    List<BucketItem> items = new ArrayList<>();
   void add(BucketItem bucketItem){
        items.add(bucketItem);
    }
}
