package ss9.ThucHanh.tim_gia_tri_tuyet_doi;

public class AbsoluteNumberCalculator {
    public static int findAbsolute(int number){
        //throw new UnsupportedOperationException();
        //return 0;
        if(number < 0)
            return  -number;
        return number;
    }
}
