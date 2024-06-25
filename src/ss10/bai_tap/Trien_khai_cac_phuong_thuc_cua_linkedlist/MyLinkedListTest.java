package ss10.bai_tap.Trien_khai_cac_phuong_thuc_cua_linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(10);

        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        list.add(2, 15);

        System.out.println("Danh sách sau khi thêm :");
        list.printList();
        System.out.println("Số lượng phần tử :" + list.size());

        int index = list.indexOf(20);
        if (index!= -1){
        System.out.println("Vị trí phần tử 20 trong danh sách :" + index);
    }else {
            System.out.println("không có phần tử thứ 20 ");
        }
        boolean contains30 = list.contains(30);

        list.remove(1);
        System.out.println("Danh sách sau khi xóa phần tử ở index 1:");
        list.printList();
    }
}
