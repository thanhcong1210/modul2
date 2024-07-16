package case_study_2;

import case_study_2.controller.Library;

public class Main {
    public static void main(String[] args) {
        Library controller = Library.getLibrary();
        controller.start();
    }
}
