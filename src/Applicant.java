
import java.util.ArrayList;
import java.util.List;

class Applicant extends User {
    private String IDno;
    private String address;
    private double householdIncome;
    private List<Document> documents;
    private ArrayList<Disbursement> disbursements = new ArrayList<Disbursement>();

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public ArrayList<Disbursement> getDisbursements() {
        return disbursements;
    }

    public void setDisbursements(ArrayList<Disbursement> disbursements) {
        this.disbursements = disbursements;
    }

    public Applicant(String username, String password, String fullname, String email, String mobileNo, String IDno, String address, double householdIncome) {
        super(username, password, fullname, email, mobileNo);
        this.IDno = IDno;
        this.address = address;
        this.householdIncome = householdIncome;
    }

    // Getter and Setter methods for additional attributes

    public String getIDno() {
        return IDno;
    }

    public void setIDno(String IDno) {
        this.IDno = IDno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getHouseholdIncome() {
        return householdIncome;
    }

    public void setHouseholdIncome(double householdIncome) {
        this.householdIncome = householdIncome;
    }
}
