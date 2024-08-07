package case_study_modul_2;

import case_study_modul_2.controller.LibraryController;

public class Main {
    public static void main(String[] args) {
        LibraryController libraryController = LibraryController.getLibraryController();
        libraryController.begin();
    }
}
