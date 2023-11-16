import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class Appeal {

        private int appealID;
        private LocalDateTime fromDate;
        private LocalDateTime toDate;
        private String description;
        private String outcome;
        private ArrayList<Disbursement> disbursements = new ArrayList<Disbursement>();
        private Organization organization;
        private List<Contribution> contributions;


    public Appeal(int appealID, LocalDateTime fromDate, LocalDateTime toDate, String description, String outcome, Organization organization, List<Contribution> contributions) {
        this.appealID = appealID;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.description = description;
        this.outcome = outcome;
        this.organization = organization;
        this.contributions = contributions;
    }
    private int requestIDvalidator(int requestIDtoValidate) {
        // to make sure that the requestID is a 6 digit number
        // if the requestID is not a 6 digit number, this will regenerate a new
        // number
        if (requestIDtoValidate < 100000 || requestIDtoValidate > 999999) {
            requestIDtoValidate = (int) (Math.random() * 900000) + 100000;
        }
        return requestIDtoValidate;
    }

    public int getAppealID() {
        return appealID;
    }

    public void setAppealID(int appealID) {
        this.appealID = appealID;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDateTime getToDate() {
        return toDate;
    }

    public void setToDate(LocalDateTime toDate) {
        this.toDate = toDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public ArrayList<Disbursement> getDisbursements() {
        return disbursements;
    }

    public void setDisbursements(ArrayList<Disbursement> disbursements) {
        this.disbursements = disbursements;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
    public void getRequestType() {
        for (Contribution contribution : contributions) {
            if (contribution instanceof CashDonation) {

                System.out.println("Processing Cash Donation");
            } else if (contribution instanceof Goods) {
                System.out.println("Processing Goods Donation");
            } else {
                System.out.println("Unknown Contribution Type");
            }
        }

    }

}







