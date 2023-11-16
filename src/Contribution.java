abstract class Contribution {
    private String contributionID;
    private String receivedDate;

    public Contribution(String contributionID, String receivedDate) {
        this.contributionID = contributionID;
        this.receivedDate = receivedDate;
    }

    // Getter and Setter methods for attributes

    public String getContributionID() {
        return contributionID;
    }

    public void setContributionID(String contributionID) {
        this.contributionID = contributionID;
    }

    public String getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(String receivedDate) {
        this.receivedDate = receivedDate;
    }
}
