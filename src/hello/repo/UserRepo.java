package hello.repo;

import hello.model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepo {

    private static UserRepo userRepo;

    private UserRepo() {
    }

    public static synchronized UserRepo getUserRepo() {
        if (userRepo == null) {
            userRepo = new UserRepo();
        }
        return userRepo;
    }

    public boolean add(User user) {
        if (!userRepo.checkUsername(user.getUsername())) {
            List<User> users = getAll();
            users.add(user);
            writeFile(users);
            return true;
        }
        System.out.println("\nTên đăng nhập đã tồn tại");
        return false;
    }

    private void writeFile(List<User> users) {
        try (FileOutputStream fos = new FileOutputStream("src/case_study_2/data/user.csv");
             ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            oos.writeObject(users);
        } catch (IOException e) {
            System.err.println("Lỗi ghi file");
        }
    }

    @SuppressWarnings("unchecked")
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream("src/case_study_2/data/user.csv");
             ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            users = (List<User>) ois.readObject();
        } catch (EOFException ignored) {
        } catch (ClassNotFoundException | IOException e) {
            System.err.println("Lỗi đọc file");
        }
        return users;
    }

    public boolean remove(String username) {
        List<User> users = getAll();
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                users.remove(user);
                writeFile(users);
                return true;
            }
        }
        return false;
    }

    public boolean checkUsername(String username) {
        List<User> users = getAll();
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
}
