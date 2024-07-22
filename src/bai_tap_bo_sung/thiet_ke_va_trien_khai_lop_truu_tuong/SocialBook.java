package bai_tap_bo_sung.thiet_ke_va_trien_khai_lop_truu_tuong;

public class SocialBook extends Book{
    private String author;

    public SocialBook(String title, String publisher, int year, String author) {
        super(title, publisher, year);
        this.author = author;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Author : " + author);
    }
}
