package bai_tap_bo_sung.thiet_ke_va_trien_khai_lop_truu_tuong;

public class Main {
    public static void main(String[] args) {
        Book[] book = new Book[5];
        book[0] = new NaturalBook("Natural Book 1", "Publisher A", 2020, 100);
        book[1] = new SocialBook("Social Book 1", "Publisher B", 2019, "Author A");
        book[2] = new NaturalBook("Natural Book 2", "Publisher C", 2021, 200);
        book[3] = new SocialBook("Social Book 2", "Publisher D", 2018, "Author B");
        book[4] = new NaturalBook("Natural Book 3", "Publisher E", 2022, 300);

        for (Book b : book) {
            b.display();
        }
    }
}
