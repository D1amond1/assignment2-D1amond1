import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library(10);

        while (true) {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add book");
            System.out.println("2. Add e-book");
            System.out.println("3. Display all books");
            System.out.println("4. Search book by title");
            System.out.println("5. Borrow book");
            System.out.println("6. Return book");
            System.out.println("7. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();

                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();

                    library.addBook(new Book(title, author, year));
                    break;

                case 2:
                    System.out.print("Enter title: ");
                    String eTitle = scanner.nextLine();

                    System.out.print("Enter author: ");
                    String eAuthor = scanner.nextLine();

                    System.out.print("Enter year: ");
                    int eYear = scanner.nextInt();

                    System.out.print("Enter file size (MB): ");
                    double fileSize = scanner.nextDouble();
                    scanner.nextLine();

                    library.addBook(new EBook(eTitle, eAuthor, eYear, fileSize));
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    System.out.print("Enter title to search: ");
                    String searchTitle = scanner.nextLine();

                    Book foundBook = library.searchByTitle(searchTitle);
                    if (foundBook != null) {
                        System.out.println(foundBook);
                    } else {
                        System.out.println("Book not found");
                    }
                    break;

                case 5:
                    System.out.print("Enter title to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    library.borrowBook(borrowTitle);
                    break;

                case 6:
                    System.out.print("Enter title to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;

                case 7:
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
