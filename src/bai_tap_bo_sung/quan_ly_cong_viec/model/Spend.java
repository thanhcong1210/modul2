package bai_tap_bo_sung.quan_ly_cong_viec.model;

import java.util.Date;

public class Spend {
    private String spendId;
    private String spendName;
    private Date spendDate;
    private double spendAmount;
    private String additionalDescription;

    public Spend(String spendId, String spendName, Date spendDate, double spendAmount, String additionalDescription) {
        this.spendId = spendId;
        this.spendName = spendName;
        this.spendDate = spendDate;
        this.spendAmount = spendAmount;
        this.additionalDescription = additionalDescription;
    }

    public String getSpendId() {
        return spendId;
    }

    public void setSpendId(String spendId) {
        this.spendId = spendId;
    }

    public String getSpendName() {
        return spendName;
    }

    public void setSpendName(String spendName) {
        this.spendName = spendName;
    }

    public Date getSpendDate() {
        return spendDate;
    }

    public void setSpendDate(Date spendDate) {
        this.spendDate = spendDate;
    }

    public double getSpendAmount() {
        return spendAmount;
    }

    public void setSpendAmount(double spendAmount) {
        this.spendAmount = spendAmount;
    }

    public String getAdditionalDescription() {
        return additionalDescription;
    }

    public void setAdditionalDescription(String additionalDescription) {
        this.additionalDescription = additionalDescription;
    }

    @Override
    public String toString() {
        return "Spend{" +
                "spendId='" + spendId + '\'' +
                ", spendName='" + spendName + '\'' +
                ", spendDate=" + spendDate +
                ", spendAmount=" + spendAmount +
                ", additionalDescription='" + additionalDescription + '\'' +
                '}';
    }
}
