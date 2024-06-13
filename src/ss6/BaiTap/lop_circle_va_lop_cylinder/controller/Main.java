package ss6.BaiTap.lop_circle_va_lop_cylinder.controller;
import ss6.BaiTap.lop_circle_va_lop_cylinder.service.CircleService;
import ss6.BaiTap.lop_circle_va_lop_cylinder.service.CylinderService;

import javafx.scene.shape.Cylinder;

public class Main {
    private static CircleService circleService = new CircleService();
    private static CylinderService cylinderService = new CylinderService();

    public static void main(String[] args) {
        //Test class circle
        circleService.add();
        circleService.display();
        circleService.getArea();
        circleService.getPerimeter();

        //test class cylinder
        cylinderService.add();
        cylinderService.display();
        cylinderService.getVolume();
    }
}
