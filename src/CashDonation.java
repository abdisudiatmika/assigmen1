class CashDonation extends Contribution {
    private double amount;
    private String paymentChannel;
    private String referenceNo;

    public CashDonation(String contributionID, String receivedDate, double amount, String paymentChannel, String referenceNo) {
        super(contributionID, receivedDate);
        this.amount = amount;
        this.paymentChannel = paymentChannel;
        this.referenceNo = referenceNo;
    }

    // Getter and Setter methods for the additional attributes

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentChannel() {
        return paymentChannel;
    }

    public void setPaymentChannel(String paymentChannel) {
        this.paymentChannel = paymentChannel;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }
}
