package ss16.thuc_hanh.tinh_tong_cac_so_trong_file_text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {

    public void readFileTest(String filePath) {
        try {
            // đọc file.txt theo đường dẫn
            File file = new File(filePath);

            //kiểm tra nếu file.txt ko tồn tại thì ném ra ngoài
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            // đọc từng dòng của file.txt và tiến hành cộng tổng lại
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                sum += Integer.parseInt(line);
            }
            br.close();

            //hiển thị ra màn hình tổng các số nguyên trong file.txt
            System.out.println("Tổng = " + sum);
        } catch (Exception e) {
            //TH file.txt không tồn tại hoặc nội dung file.txt có lỗi thì sẽ hiển thị thông báo lỗi.
            System.err.println("File không tồn tài or nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
        System.out.println("nhập đường dẫn file.txt: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileEx = new ReadFileExample();
        readFileEx.readFileTest(path);
    }
}