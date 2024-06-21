package ss12.bai_tap.luyen_tap_su_dung_linkedList_arrayList;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so luong san pham: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin san pham " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.print("Ten: ");
            String name = scanner.nextLine();
            System.out.print("Gia: ");
            int price = Integer.parseInt(scanner.nextLine());

            Product product = new Product(id, name, price);
            productManager.addProduct(product);
        }

        // Lấy danh sách sản phẩm và sắp xếp theo giá tăng dần
        List<Product> products = productManager.getProductList();
        productManager.sortProductByPricesAsc(products);

        // Hiển thị danh sách sản phẩm đã sắp xếp
        System.out.println("Sap xep theo gia tang dan, neu gia bang nhau thi sap xep giam dan theo ten:");
        products.stream().forEach(p -> System.out.println(p));

        // Chỉnh sửa sản phẩm
        System.out.println("Nhap ID san pham can cap nhat: ");
        int updateId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap thong tin moi:");
        System.out.print("Ten moi: ");
        String newName = scanner.nextLine();
        System.out.print("Gia moi: ");
        int newPrice = Integer.parseInt(scanner.nextLine());

        Product updateProduct = new Product(updateId, newName, newPrice);
        if (productManager.editProduct(updateProduct)) {
            System.out.println("Cap nhat san pham thanh cong");
        } else {
            System.out.println("Cap nhat san pham that bai");
        }


        System.out.println("Nhap ID san pham can xoa: ");
        int deleteId = Integer.parseInt(scanner.nextLine());

        if (productManager.deleteProduct(deleteId)) {
            System.out.println("Xoa san pham thanh cong");
        } else {
            System.out.println("Xoa san pham that bai");
        }


        products.stream().forEach(p -> System.out.println(p));

        scanner.close();
    }
}
