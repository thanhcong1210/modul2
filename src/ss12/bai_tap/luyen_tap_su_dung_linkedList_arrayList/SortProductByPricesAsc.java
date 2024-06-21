package ss12.bai_tap.luyen_tap_su_dung_linkedList_arrayList;


public class SortProductByPricesAsc implements java.util.Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Integer.compare(p1.getPrice(), p2.getPrice());
    }
}

