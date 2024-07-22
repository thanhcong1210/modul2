package bai_tap_bo_sung.thiet_ke_va_trien_khai_lop_truu_tuong;

public class Book implements IBook{
    private String title;
    private String publisher;
    private int year;

    public Book(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    @Override
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Publisher : " + publisher);
        System.out.println("Year :" + year);
    }
}
