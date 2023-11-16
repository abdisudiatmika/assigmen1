class Document {
    private int documentID;
    private String filename;
    private String description;

    public Document(int documentID, String filename, String description) {
        this.documentID = documentID;
        this.filename = filename;
        this.description = description;
    }

    // Getter dan Setter untuk atribut documentID
    public int getDocumentID() {
        return documentID;
    }

    public void setDocumentID(int documentID) {
        this.documentID = documentID;
    }

    // Getter dan Setter untuk atribut filename
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    // Getter dan Setter untuk atribut description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
