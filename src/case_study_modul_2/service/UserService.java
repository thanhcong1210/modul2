package case_study_modul_2.service;

import case_study_modul_2.model.User;
import case_study_modul_2.repository.UserRepository;

import java.util.List;

public class UserService {
    private static UserService userService;
    private final UserRepository userRepository = UserRepository.getRepository();

    private UserService() {
    }

    public static synchronized UserService getService() {
        if (userService == null) {
            userService = new UserService();
        }
        return userService;
    }

    public boolean userName(String userName) {
        List<User> userList = userRepository.getAll();
        for (User user : userList) {
            if (user.getName().equals(userName)) {
                return true;
            }
        }
        return false;
    }

    public boolean addUser(User user) {
        return userRepository.add(user);
    }

    public boolean removeUser(String userName) {
        return userRepository.remove(userName);
    }

    public List<User> getAll() {
        return userRepository.getAll();
    }
}
