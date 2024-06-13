package ss6.BaiTap.lop_point2d_va_lop_point3d.controller;

import ss6.BaiTap.lop_point2d_va_lop_point3d.service.Point2DService;
import ss6.BaiTap.lop_point2d_va_lop_point3d.service.Point3DService;

public class Main {

    private static Point2DService point2DService = new Point2DService();
    private static Point3DService point3DService = new Point3DService();

    public static void main(String[] args) {
        //test class point2D
       point2DService.add();
       point2DService.display();

       //test class point3D
        point3DService.add();
        point3DService.display();
    }
}
