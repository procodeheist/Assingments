package Day11.CollectionAssignment2;

import java.util.Comparator;

public class IdCompare implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
       if(o1.getProductId()<o2.getProductId()){
           return +1;
       }
       else if(o1.getProductId()>o2.getProductId()){
           return -1;
       }
       else {
           return 0;
       }
    }
}
