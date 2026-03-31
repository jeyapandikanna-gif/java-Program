
package librarymanagement;
import java.util.*;

class Book {
    int id;
    String title;
    String author;
    String status;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.status = "Available";
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Status: " + status);
        System.out.println("----------------------");
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();

        while (true) {
            System.out.println("\n1.Add 2.View 3.Search 4.Issue 5.Return 6.Delete 7.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();

                    boolean exists = false;
                    for (Book b : list) {
                        if (b.id == id) {
                            exists = true;
                            break;
                        }
                    }
                    if (exists) {
                        System.out.println("Book ID already exists!");
                        break;
                    }

                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String t = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String a = sc.nextLine();

                    list.add(new Book(id, t, a));
                    System.out.println("Book Added!");
                    break;

                case 2:
                    if (list.isEmpty()) {
                        System.out.println("No books found!");
                    } else {
                        for (Book b : list) {
                            b.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    int sid = sc.nextInt();
                    boolean found = false;
                    for (Book b : list) {
                        if (b.id == sid) {
                            b.display();
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Book not found!");
                    break;

                case 4:
                    System.out.print("Enter Book ID to issue: ");
                    int iid = sc.nextInt();
                    for (Book b : list) {
                        if (b.id == iid) {
                            if (b.status.equals("Issued")) {
                                System.out.println("Already Issued!");
                            } else {
                                b.status = "Issued";
                                System.out.println("Book Issued!");
                            }
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.print("Enter Book ID to return: ");
                    int rid = sc.nextInt();
                    for (Book b : list) {
                        if (b.id == rid) {
                            if (b.status.equals("Available")) {
                                System.out.println("Already Available!");
                            } else {
                                b.status = "Available";
                                System.out.println("Book Returned!");
                            }
                            break;
                        }
                    }
                    break;

                case 6:
                    System.out.print("Enter Book ID to delete: ");
                    int did = sc.nextInt();
                    Iterator<Book> it = list.iterator();
                    boolean deleted = false;
                    while (it.hasNext()) {
                        Book b = it.next();
                        if (b.id == did) {
                            it.remove();
                            deleted = true;
                            System.out.println("Book Deleted!");
                            break;
                        }
                    }
                    if (!deleted) System.out.println("Book not found!");
                    break;

                case 7:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }
}

