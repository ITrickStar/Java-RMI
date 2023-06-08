package soap;

import java.util.ArrayList;

public class Users {
    private static final ArrayList<String> worker_ids = new ArrayList<>();
    private static final ArrayList<String> reader_ids = new ArrayList<>();
    private static final ArrayList<ArrayList<String>> debts_ids = new ArrayList<>();

    public Users() {
        worker_ids.add("w1234");
        addUser("w1234");
    }

    public boolean addUser(String id) {
        if (getUserIndex(id) != -1) return false;
        reader_ids.add(id);
        debts_ids.add(new ArrayList<>());
        return true;
    }

    public boolean addDebt(String id, String ISBN) {
        int ind = getUserIndex(id);
        if (ind == -1) return false;

        debts_ids.get(ind).add(ISBN);
        return true;
    }

    public boolean removeDebt(String id, String ISBN) {
        int ind = getUserIndex(id);
        if (ind == -1) return false;

        debts_ids.get(ind).remove(ISBN);
        return true;
    }

    public ArrayList<String> getDebts(String id) {
        int ind = getUserIndex(id);
        return debts_ids.get(ind);
    }

    public boolean chkRights(String id) {
        return worker_ids.contains(id);
    }

    public void getUsers() {
        for (int i = 0; i < worker_ids.size(); i++) {
            System.out.println(worker_ids.get(i));
        }
        for (int i = 0; i < reader_ids.size(); i++) {
            System.out.println(reader_ids.get(i));
        }
    }

    public int getUserIndex(String id) {
        for (int i = 0; i < reader_ids.size(); i++) {
            if (reader_ids.get(i).equals(id)) return i;
        }
        return -1;
    }
}
