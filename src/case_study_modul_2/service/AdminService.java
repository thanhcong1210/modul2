package case_study_modul_2.service;

import case_study_modul_2.model.User;

import java.util.List;

public class AdminService {
    private static AdminService service;

    private AdminService() {
    }

    public static synchronized AdminService getService() {
        if (service == null) {
            service = new AdminService();
        }
        return service;
    }

    public boolean loginAdmin(String[] admin){
        return admin[0].equals("admin")
                && admin[1].equals("123");
    }

    public boolean loginUser(List<User> userList, String[] account){
        for (User user : userList) {
            if (user.getUsername().equals(account[0])
                    && user.getPassword().equals(account[1])) {
                return true;
            }
        }
        return false;
    }
}
