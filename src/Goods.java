class Goods extends Contribution {
    private String description;
    private double estimatedValue;

    public Goods(String contributionID, String receivedDate, String description, double estimatedValue) {
        super(contributionID, receivedDate);
        this.description = description;
        this.estimatedValue = estimatedValue;
    }

    // Getter and Setter methods for the additional attributes

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getEstimatedValue() {
        return estimatedValue;
    }

    public void setEstimatedValue(double estimatedValue) {
        this.estimatedValue = estimatedValue;
    }
}
