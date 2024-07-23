package bai_tap_bo_sung.quan_ly_cong_viec;

import bai_tap_bo_sung.quan_ly_cong_viec.controller.SpendController;
import bai_tap_bo_sung.quan_ly_cong_viec.repository.ISpendRepository;
import bai_tap_bo_sung.quan_ly_cong_viec.repository.SpendRepository;
import bai_tap_bo_sung.quan_ly_cong_viec.service.ISpendService;
import bai_tap_bo_sung.quan_ly_cong_viec.service.SpendService;
import bai_tap_bo_sung.quan_ly_cong_viec.view.SpendView;

public class Main {
    public static void main(String[] args) {
        ISpendRepository spendRepository = new SpendRepository();
        ISpendService spendService = new SpendService(spendRepository);
        SpendView spendView = new SpendView();
        SpendController spendController = new SpendController(spendService, spendView);

        spendController.showMenu();
    }
}
