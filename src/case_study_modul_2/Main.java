package case_study_modul_2;

import case_study_modul_2.controller.LibraryController;

public class Main {
    public static void main(String[] args) {
        LibraryController controller = LibraryController.getLibraryController();
        controller.begin();
    }
}
