import java.util.List;
import java.util.ArrayList;

public class Organization {
    private int orgid;
    private String orgname;
    private String address;
    private List<OrganizationRep> members; // List of User objects representing members
    private List<Applicant> applicants;
    private List<Appeal> appeals;

    public List<OrganizationRep> getMembers() {
        return members;
    }

    public void setMembers(List<OrganizationRep> members) {
        this.members = members;
    }

    public void setApplicants(List<Applicant> applicants) {
        this.applicants = applicants;
    }

    public void setAppeals(List<Appeal> appeals) {
        this.appeals = appeals;
    }

    public Organization(int orgid, String orgname, String address) {
        this.orgid = orgid;
        this.orgname = orgname;
        this.address = address;

    }

    // Getter and Setter methods for attributes

    public int getOrgid() {
        return orgid;
    }

    public void setOrgid(int orgid) {
        this.orgid = orgid;
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addRepresentative(OrganizationRep rep) {
        members.add(rep);
    }

    // Mengambil daftar perwakilan organisasi
    public List<OrganizationRep> getRepresentatives() {
        return members;
    }



    // Menambahkan Aid Applicant
    public void addApplicant(Applicant applicant) {
        applicants.add(applicant);
    }

    // Mengambil daftar Aid Applicant
    public List<Applicant> getApplicants() {
        return applicants;
    }
    public void addAppeal(Appeal appeal) {
        appeals.add(appeal);
    }
    public List<Appeal> getAppeals() {
        return appeals;
    }
    public Appeal getAppealByID(int appealID) {
        for (Appeal appeal : appeals) {
            if (appeal.getAppealID() == appealID) {
                return appeal;
            }
        }
        return null;
    }


}
