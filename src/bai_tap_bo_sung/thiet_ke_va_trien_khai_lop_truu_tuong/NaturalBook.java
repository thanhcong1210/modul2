package bai_tap_bo_sung.thiet_ke_va_trien_khai_lop_truu_tuong;

public class NaturalBook extends Book{
    private int copies;

    public NaturalBook(String title, String publisher, int year, int copies) {
        super(title, publisher, year);
        this.copies = copies;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Copies: " + copies);
    }
}
