package soap;

import soap.service.LibServer;
import soap.service.LibServerService;

import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class LibClient {
    private static final String id = "w1234";

    public static void main(String[] args) throws Exception {
        LibServerService libServerService = new LibServerService(new URL("http://localhost:8080/LibServer?wsdl"));
        LibServer proxy = libServerService.getLibServerPort();

        show(id + ' ' + proxy.chkRightsLib(id));
        while (true) {
            System.out.println("1. Get list of books");
            System.out.println("2. Check debts");
            System.out.println("3. Borrow book");
            System.out.println("4. Return book");
            if (proxy.chkRightsLib(id).equals("Worker")) {
                System.out.println("5. WO: Create new book in the list");
                System.out.println("6. W0: Add new book instances");
            }

            switch ((new Scanner(System.in)).nextInt()) {
                case 1: {
                    List<String> response = proxy.getLib();
                    show(response);
                    break;
                }
                case 2: {
                    List<String> response = proxy.showDebts(id);
                    show(response);
                    break;
                }
                case 3: {
                    System.out.println("Enter ISBN: ");
                    String ISBN = (new Scanner(System.in)).nextLine();
                    String response = proxy.borrowLib(id, ISBN);
                    show(response);
                    break;
                }
                case 4: {
                    System.out.println("Enter ISBN: ");
                    String ISBN = (new Scanner(System.in)).nextLine();
                    String response = proxy.returnLib(id, ISBN);
                    show(response);
                    break;
                }
                case 5: {
                    if (!proxy.chkRightsLib(id).equals("Worker")) {
                        System.out.println("Access Denied!");
                        break;
                    }
                    System.out.println("Enter ISBN: ");
                    String ISBN = (new Scanner(System.in)).nextLine();
                    System.out.println("Enter Authors: ");
                    String authors = (new Scanner(System.in)).nextLine();
                    System.out.println("Enter Year: ");
                    String year = (new Scanner(System.in)).nextLine();
                    System.out.println("Enter Publisher: ");
                    String publisher = (new Scanner(System.in)).nextLine();
                    System.out.println("Enter Title: ");
                    String title = (new Scanner(System.in)).nextLine();
                    String response = proxy.newLib(id, ISBN, authors, year, publisher, title);
                    show(response);
                    break;
                }
                case 6: {
                    if (!proxy.chkRightsLib(id).equals("Worker")) {
                        System.out.println("Access Denied!");
                        break;
                    }
                    System.out.println("Enter ISBN: ");
                    String ISBN = (new Scanner(System.in)).nextLine();
                    System.out.println("Enter Amount: ");
                    int amount = (new Scanner(System.in)).nextInt();
                    String response = proxy.addLib(id, ISBN, amount);
                    show(response);
                    break;
                }
                default: {
                    String response = proxy.hello(id);
                    show(response);
                    break;
                }
            }
        }
    }

    public static void show(List<String> str) {
        System.out.println("response = ");
        for (int i = 0; i < str.size(); i++) {
            System.out.println(str.get(i));
        }
        System.out.println();
    }

    public static void show(String str) {
        System.out.println("response = " + str + '\n');
    }
}