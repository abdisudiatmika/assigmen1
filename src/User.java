import java.util.Objects;

abstract class User {
    private String username;
    private String password;
    private String fullname;
    private String email;
    private String mobileNo;

    public User(String username, String password, String fullname, String email, String mobileNo) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.email = email;
        this.mobileNo = mobileNo;
    }

    // Getter and Setter methods for attributes

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        return username.equals(user.username);
    }
    @Override
    public int hashCode() {
        return Objects.hash(username);
    }
    public boolean isApplicant() {
        // basically checks if 'this' is an instance of Volunteer

        return this instanceof Applicant;
    }
    public boolean isOrganizationRep() {
        // basically checks if 'this' is an instance of Volunteer

        return this instanceof OrganizationRep;
    }
}
