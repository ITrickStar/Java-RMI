package soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class LibServer {
    private final Library lib = new Library();
    private final Users users = new Users();

    @WebMethod
    public String[] getLib() {
        return lib.getLibInfo();
    }

    public String[] showDebts(String id) {
        users.addUser(id);
        String[] debt_list = users.getDebts(id).toArray(new String[0]);
        return debt_list;
    }

    @WebMethod
    public String hello(String id) {
        users.getUsers();
        String reg = " is registered";
        if (users.getUserIndex(id) == -1) reg = " isn't registered";
        return "Hello, " + id + reg;
    }

    @WebMethod
    public String regUser(String id) {
        users.addUser(id);
        String reg = " is registered";
        if (users.getUserIndex(id) == -1) reg = " isn't registered";
        System.out.println(users.getUserIndex(id));
        return "Hello, " + id + reg;
    }

    @WebMethod
    public String addLib(String id, String ISBN, int amount) {
        if (users.chkRights(id)) {
            System.out.println(id + " action added" + amount);
            if (lib.addBook(ISBN, amount)) {
                System.out.println("Success!");
                return id + " added " + ISBN + " amount " + amount;
            }
        }

        System.out.println("Failure!");
        return "Error";
    }

    @WebMethod
    public String newLib(String id, final String _ISBN, final String _authors, final String _year, final String _publisher, final String _title) {
        if (users.chkRights(id)) {
            System.out.println(id + " action new");
            if (lib.newBook(_ISBN, _authors, _year, _publisher, _title)) {
                System.out.println("Success!");
                return id + " added new " + _ISBN;
            }
        }

        System.out.println("Failure!");
        return "Error";
    }

    @WebMethod
    public String borrowLib(String id, String ISBN) {
        users.addUser(id);
        System.out.println(id + " action borrow");
        if (lib.borrowBook(ISBN)) {
            users.addDebt(id, ISBN);
            System.out.println("Success!");
            return id + " received " + ISBN;
        }

        System.out.println("Failure!");
        return "No book available";
    }

    @WebMethod
    public String returnLib(String id, String ISBN) {
        users.addUser(id);
        System.out.println(id + " action return");
        if (users.getDebts(id).contains(ISBN) && lib.addBook(ISBN, 1)) {
            users.removeDebt(id, ISBN);
            System.out.println("Success!");
            return id + " returned " + ISBN;
        }

        System.out.println("Failure!");
        return "Error";
    }

    @WebMethod
    public String chkRightsLib(String id) {
        System.out.println(id + " action check rights");
        if (users.chkRights(id))
            return "Worker";
        return "User";
    }

    private void show(String[] str) {
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
