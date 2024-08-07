package case_study_modul_2.service;

import case_study_modul_2.model.User;

import java.util.List;

public class AdminService {
    private static AdminService adminService;

    public AdminService() {
    }

    public static synchronized AdminService getService() {
        if (adminService == null) {
            adminService = new AdminService();
        }
        return adminService;
    }

    public boolean loginAdmin(String[] data) {
        return data[0].equals("admin") && data[1].equals("123");
    }

    public boolean loginUser(List<User> users1, String[] user) {
        for (User user1 : users1) {
            if (user1.getUsername().equals(user[0]) && user1.getPassword().equals(user[1])) {
                return true;
            }
        }
        return false;
    }
}
