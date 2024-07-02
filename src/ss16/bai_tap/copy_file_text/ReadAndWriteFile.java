package ss16.bai_tap.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFile {
    public List<String> readFile(String filePath) {
        List<String> strings = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                strings.add(line);
            }
        } catch (IOException e) {
            System.out.println("File nguồn không tồn tại!");
        }
        return strings;
    }

    public void writeFile(String filePath, List<String> strings) {
        File file = new File(filePath);
        boolean appendOption = true;

        if (file.exists()) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nCảnh báo: File đích đã tồn tại!");
            System.out.println("Các lựa chọn ghi file:");
            System.out.println("1. Giữ dữ liệu cũ trong file rồi ghi thêm dữ liệu mới (Mặc định).");
            System.out.println("2. Xóa dữ liệu cũ trong file rồi ghi dữ liệu mới");
            System.out.println("3. Thoát chương trình.");

            int optionWriteFile = 1;
            try {
                optionWriteFile = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Mặc định: Lựa chọn 1. Giữ dữ liệu cũ trong file rồi ghi thêm dữ liệu mới");
            }

            if (optionWriteFile == 2) appendOption = false;
            else if (optionWriteFile == 3) return;
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, appendOption))) {
            if (appendOption) bufferedWriter.newLine();
            for (String str : strings) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            System.out.println("Ghi file thành công!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
