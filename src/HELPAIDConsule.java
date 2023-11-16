public class HELPAIDConsule {

    public static void main(String[] args) {
        HELPAid  helpAID= new HELPAid();

        // Menambahkan Applicant
        helpAID("applicant1", "password123", "John Doe", "john@example.com", "123456789",
                "ID123", "123 Main St", "Family of 4");

        // Menambahkan OrganizationRep
        helpAID.addOrganizationRep("orgRep1", "pass456", "Jane Smith", "jane@example.com", "987654321",
                "Human Resources Manager");

        // Menampilkan informasi pengguna
        for (User user : helpAID.getUsers()) {
            if (user instanceof Applicant) {
                Applicant applicant = (Applicant) user;
                System.out.println("Applicant: " + applicant.getFullname() + ", ID: " + applicant.getIDno());
            } else if (user instanceof OrganizationRep) {
                OrganizationRep organizationRep = (OrganizationRep) user;
                System.out.println("OrganizationRep: " + organizationRep.getFullname() +
                        ", Job Title: " + organizationRep.getJobTitle());
            }
        }

    }
}
