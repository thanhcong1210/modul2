package bai_tap_bo_sung.quan_ly_cong_viec.controller;

import bai_tap_bo_sung.quan_ly_cong_viec.model.Spend;
import bai_tap_bo_sung.quan_ly_cong_viec.service.ISpendService;
import bai_tap_bo_sung.quan_ly_cong_viec.service.SpendService;
import bai_tap_bo_sung.quan_ly_cong_viec.view.SpendView;

import java.util.List;

public class SpendController {
    private ISpendService spendService;
    private SpendView spendView;

    public SpendController(ISpendService spendService, SpendView spendView) {
        this.spendService = spendService;
        this.spendView = spendView;
    }

    public void showMenu(){
        int choice;
        do {
            spendView.displayMenu();
            choice = spendView.getScanner().nextInt();
            spendView.getScanner().nextLine();

            switch (choice) {
                case 1:
                    displayAll();
                    break;
                case 2:
                    addSpend();
                    break;
                case 3:
                    deleteSpend();
                    break;
                case 4:
                    updateSpend();
                    break;
                case 5:
                   searchBySpendId();
                    break;
                case 6 :
                    searchBySpendName();
                    break;
                case 7 :
                    spendView.displayMessage("Thoát!!!");
                    break;
                default:
                    spendView.displayMessage("Lựa chọn không hợp lệ!!! Vui lòng chọn lại.");
                    break;
            }
        }while (choice != 7);
    }

    private void displayAll() {
        List<Spend> spendList = spendService.getAllSpends();
        spendView.displaySpendList(spendList);
    }

    private void addSpend() {
        Spend spend = spendView.getSpendDetails();
        spendService.addSpend(spend);
        spendView.displayMessage("Thêm chi tiêu thành công");
    }

    private void deleteSpend() {
        String spendId = spendView.getSpendId();
        spendService.deleteSpendById(spendId);
        spendView.displayMessage("Xóa chi tiêu thành công.");
    }

    private void updateSpend(){
        String spendId = spendView.getSpendId();
        Spend spend = spendService.getSpendById(spendId);
        if (spend != null) {
            spend = spendView.getSpendDetails();
            spend.setSpendId(spendId);
            spendService.addSpend(spend);
            spendView.displayMessage("Cập nhật chi tiêu thành công.");
        }else {
            spendView.displayMessage("Spend id " + spendId + " không tìm thấy.");
        }
    }

    private void searchBySpendId() {
        String spendId = spendView.getSpendId();
        Spend spend = spendService.getSpendById(spendId);
        if (spend!= null) {
            spendView.displaySpendList(List.of(spend));
        } else {
            spendView.displayMessage("Spend ID " + spendId + " không tìm thấy.");
        }
    }

    private void searchBySpendName() {
        String spendName = spendView.getSpendName();
        List<Spend> spendList = spendService.searchSpendByName(spendName);
        spendView.displaySpendList(spendList);
    }
}
