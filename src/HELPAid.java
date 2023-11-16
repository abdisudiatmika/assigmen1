import java.util.ArrayList;
import java.util.List;

public class HELPAid {
    private static ArrayList<User> users = new ArrayList<User>();

    public HELPAid() {
        users.add(new Applicant("abdi","123","abdi sudiatmika ","sd@gmail","12345","1231","sadadd",1223);
    }

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<User> users) {
        HELPAid.users = users;
    }

    public static boolean add(User user) {
        return users.add(user);
    }

    public static boolean remove(Object o) {
        return users.remove(o);
    }

}

