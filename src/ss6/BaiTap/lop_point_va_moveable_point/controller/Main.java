package ss6.BaiTap.lop_point_va_moveable_point.controller;

import ss6.BaiTap.lop_point_va_moveable_point.model.MoveablePoint;;
import ss6.BaiTap.lop_point_va_moveable_point.service.PointService;

public class Main {
    private static PointService pointService = new PointService();
    private static MoveablePoint moveablePointService = new MoveablePoint();

    public static void main(String[] args) {

        pointService.add();
        pointService.display();

        moveablePointService.add();
        moveablePointService.display();

        System.out.println("After move:");
        moveablePointService.move();
    }
}
