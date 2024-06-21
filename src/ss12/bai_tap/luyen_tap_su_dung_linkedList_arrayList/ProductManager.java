package ss12.bai_tap.luyen_tap_su_dung_linkedList_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManager {
    private static List<Product> productList;

    // Khởi tạo danh sách sản phẩm
    static {
        productList = new ArrayList<>();
    }

    void addProduct(Product p) {
        productList.add(p);
    }

    public boolean editProduct(Product p) {
        for (Product product : productList) {
            if (product.getId() == p.getId()) {
                product.setName(p.getName());
                product.setPrice(p.getPrice());
                return true;
            }
        }
        return false;
    }

    public boolean deleteProduct(int id) {
        Product p = null;
        for (Product product : productList) {
            if (product.getId() == id) {
                p = product;
                break;
            }
        }
        if (p != null) {
            productList.remove(p);
            return true;
        }
        return false;
    }

    public static List<Product> getProductList() {
        return productList;
    }

    public Product getProductById(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public List<Product> findProductByName(String name) {
        List<Product> list = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                list.add(product);
            }
        }
        return list;
    }

    public void sortProductByPricesAsc(List<Product> list) {
        Collections.sort(list, new SortProductByPricesAsc());
    }
}
