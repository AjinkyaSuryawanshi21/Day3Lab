package collections;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
            return p1.getPid() - p2.getPid();
    }
}
