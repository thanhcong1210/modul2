package case_study_modul_2.repository;

import case_study_modul_2.model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static UserRepository userRepository;

    private UserRepository() {
    }

    public static synchronized UserRepository getUserRepository() {
        if (userRepository == null) {
            userRepository = new UserRepository();
        }
        return userRepository;
    }

    private static void writeFile(List<User> users) {
        try (FileOutputStream fos = new FileOutputStream("src/case_study_modul_2/data/user.csv");
             ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            oos.writeObject(users);
        } catch (IOException e) {
            System.err.println("Lỗi ghi file!!!");
        }
    }

    public List<User> getAll() {
        List<User> user2 = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream("src/case_study_modul_2/data/user.csv");
             ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            user2 = (List<User>) ois.readObject();
        } catch (EOFException eof) {
        } catch (ClassNotFoundException | IOException e) {
            System.err.println("Lỗi đọc file");
        }
        return user2;
    }

    public boolean add(User user) {
        if (!userRepository.checkUserName(user.getUsername())) {
            List<User> users = getAll();
            users.add(user);
            writeFile(users);
            return true;
        }
        System.out.println("Tên đăng nhập đã tồn tại!!!");
        return false;
    }

    public boolean remove(String userName) {
        List<User> users = getAll();
        for (User user : users) {
            if (user.getUsername().equals(userName)) {
                users.remove(user);
                writeFile(users);
                return true;
            }
        }
        return false;
    }

    public boolean checkUserName(String username) {
        List<User> users = getAll();
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
}
