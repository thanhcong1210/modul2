package hello;

import hello.controller.Library;

public class Main {
    public static void main(String[] args) {
        Library controller = Library.getLibrary();
        controller.start();
    }
}
