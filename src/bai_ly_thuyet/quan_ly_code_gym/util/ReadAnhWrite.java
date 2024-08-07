package bai_ly_thuyet.quan_ly_code_gym.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAnhWrite {
    public static void writeStringListToCSV(String filePath, List<String> stringList, boolean append) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, append))) {
            for (String line : stringList) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFileCSVToListString(String filePath) {
        List<String> stringList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                stringList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
}
