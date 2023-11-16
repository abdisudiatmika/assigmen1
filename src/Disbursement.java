import java.time.LocalDateTime;

public class Disbursement {
    private LocalDateTime disbursementDate;
    private String CashAmount;
    private String goodsDisbursed;
    // each offer instance is owned by a volunteer instance
    private Applicant isOwnedBy;

    public LocalDateTime getDisbursementDate() {
        return disbursementDate;
    }

    public Applicant getIsOwnedBy() {
        return isOwnedBy;
    }

    public void setIsOwnedBy(Applicant isOwnedBy) {
        this.isOwnedBy = isOwnedBy;
    }

    public void setDisbursementDate(LocalDateTime disbursementDate) {
        this.disbursementDate = disbursementDate;
    }

    public String getCashAmount() {
        return CashAmount;
    }

    public void setCashAmount(String cashAmount) {
        CashAmount = cashAmount;
    }

    public String getGoodsDisbursed() {
        return goodsDisbursed;
    }

    public void setGoodsDisbursed(String goodsDisbursed) {
        this.goodsDisbursed = goodsDisbursed;
    }

    public Disbursement(LocalDateTime disbursementDate, String cashAmount, String goodsDisbursed, Applicant isOwnedBy) {
        this.disbursementDate = disbursementDate;
        CashAmount = cashAmount;
        this.goodsDisbursed = goodsDisbursed;
        this.isOwnedBy = isOwnedBy;
    }

    @Override
    public String toString() {
        return "Disbursement{" +
                "disbursementDate=" + disbursementDate +
                ", CashAmount='" + CashAmount + '\'' +
                ", goodsDisbursed='" + goodsDisbursed + '\'' +
                ", isOwnedBy=" + isOwnedBy +
                '}';
    }
}
