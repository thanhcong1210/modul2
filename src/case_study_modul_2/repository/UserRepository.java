package case_study_modul_2.repository;

import case_study_modul_2.model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static UserRepository userRepository;
    private static final String USER = "D:\\modul2\\untitled\\src\\case_study_modul_2\\data\\user.dat";

    private UserRepository() {
    }

    public static synchronized UserRepository getRepository() {
        if (userRepository == null) {
            userRepository = new UserRepository();
        }
        return userRepository;
    }

    private void writeFile(List<User> userList){
        try (
                FileOutputStream fos = new FileOutputStream(USER);
                ObjectOutputStream oos = new ObjectOutputStream(fos)
                ){
            oos.writeObject(userList);

        } catch (IOException e) {
            System.err.println("Lỗi ghi file!!!");
        }
    }

    public List<User> getAll() {
        List<User> userList = new ArrayList<>();
        try (
                FileInputStream fis = new FileInputStream(USER);
                ObjectInputStream ois = new ObjectInputStream(fis)
                ){
            userList = (List<User>) ois.readObject();

        } catch (EOFException ignored) {
        } catch (ClassNotFoundException | IOException e) {
            System.err.println("Lỗi đọc file!!!");
        }
        return userList;
    }

    public boolean add(User user) {
        if (!userRepository.userName(user.getUsername())) {
            List<User> userList = getAll();
            userList.add(user);
            writeFile(userList);
            return true;
        }
        System.out.println("Tên đăng nhập đã tồn tại!!!");
        return false;
    }

    public boolean userName(String userName){
        List<User> userList = getAll();
        for (User user : userList) {
            if (user.getUsername().equals(userName)) {
                return true;
            }
        }
        return false;
    }

    public boolean remove(String userName) {
        List<User> userList = getAll();
        for (User user : userList) {
            if (user.getUsername().equals(userName)) {
                userList.remove(user);
                writeFile(userList);
                return true;
            }
        }
        System.out.println("Tên đăng nhập không tồn tại!!!");
        return false;
    }
}
