package ss21.thuc_hanh.trien_khai_object_pool;

public class TaxiNotFoundException extends RuntimeException{
    public TaxiNotFoundException(String message){
        System.out.println(message);
    }
}
