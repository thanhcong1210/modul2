package case_study_modul_2.service;

import case_study_modul_2.model.User;
import case_study_modul_2.repository.UserRepository;

import javax.management.openmbean.CompositeData;
import java.util.List;

public class UserService {
    private static UserService userService;

    private UserService() {
    }

    public static synchronized UserService getUserService() {
        if (userService == null) {
            userService = new UserService();
        }
        return userService;
    }

    private final UserRepository userRepository = UserRepository.getUserRepository();

    public List<User> getAll() {
        return userRepository.getAll();
    }

    public boolean add(User user) {
        return userRepository.add(user);
    }

    public boolean remove(String userName) {
        return userRepository.remove(userName);
    }

    public boolean checkUsername(String username) {
        List<User> user1 = userRepository.getAll();
        for (User user : user1) {
            if (user.getUsername().equals(username)){
                return true;
            }
        }
        return false;
    }

}
