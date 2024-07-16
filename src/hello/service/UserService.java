package hello.service;

import hello.model.User;
import hello.repo.UserRepo;

import java.util.List;

public class UserService{
    private static UserService userService;

    private UserService() {
    }

    public static synchronized UserService getUserService() {
        if (userService == null) {
            userService = new UserService();
        }
        return userService;
    }

    public boolean checkUsername(String username) {
        List<User> users = userRepo.getAll();
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    private final UserRepo userRepo = UserRepo.getUserRepo();


    public boolean add(User user) {
        return userRepo.add(user);
    }


    public List<User> getAll() {
        return userRepo.getAll();
    }

    public boolean remove(String username) {
        return userRepo.remove(username);
    }
}
