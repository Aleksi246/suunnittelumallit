package t18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Recomendation> recommendations = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nbook recommendation system");
            System.out.println("1. view recommendations");
            System.out.println("2. clone and modify a recommendation");
            System.out.println("3. create a new recommendation");
            System.out.println("4. modify existing recommendation");
            System.out.println("5. exit");
            System.out.print("Choice: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    viewRecommendations(recommendations);
                    break;
                case "2":
                    cloneAndModify(recommendations, scanner);
                    break;
                case "3":
                    createNew(recommendations, scanner);
                    break;
                case "4":
                    modifyExisting(recommendations, scanner);
                    break;
                case "5":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        System.out.println("Final list:");
        viewRecommendations(recommendations);
        scanner.close();
    }

    private static void viewRecommendations(List<Recomendation> recommendations) {
        if (recommendations.isEmpty()) {
            System.out.println("No recommendations yet.");
            return;
        }
        for (int i = 0; i < recommendations.size(); i++) {
            System.out.println("[" + i + "] " + recommendations.get(i));
        }
    }

    private static void cloneAndModify(List<Recomendation> recommendations, Scanner scanner) {
        if (recommendations.isEmpty()) {
            System.out.println("No recommendations to clone.");
            return;
        }
        viewRecommendations(recommendations);
        System.out.print("Index to clone: ");
        int index;
        try {
            index = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number.");
            return;
        }
        if (index < 0 || index >= recommendations.size()) {
            System.out.println("Index out of range.");
            return;
        }

        Recomendation cloned = recommendations.get(index).clone();
        System.out.print("New target audience (blank to keep \"" + cloned.getTargetAudience() + "\"): ");
        String audience = scanner.nextLine().trim();
        if (!audience.isEmpty()) {
            cloned.setTargetAudience(audience);
        }

        // Remove books
        List<Book> books = cloned.getBooks();
        if (!books.isEmpty()) {
            System.out.println("Current books in clone:");
            for (int i = 0; i < books.size(); i++) {
                System.out.println("  [" + i + "] " + books.get(i));
            }
            System.out.println("Enter indices to remove (comma-separated, blank to skip):");
            System.out.print("  Remove: ");
            String removeInput = scanner.nextLine().trim();
            if (!removeInput.isEmpty()) {
                String[] parts = removeInput.split(",");
                List<Book> toRemove = new ArrayList<>();
                for (String part : parts) {
                    try {
                        int ri = Integer.parseInt(part.trim());
                        if (ri >= 0 && ri < books.size()) {
                            toRemove.add(books.get(ri));
                        }
                    } catch (NumberFormatException e) {
                        // skip invalid
                    }
                }
                for (Book b : toRemove) {
                    cloned.removeBook(b);
                }
            }
        }

        System.out.println("Add books to the clone (blank title to stop):");
        while (true) {
            System.out.print("  Book title: ");
            String title = scanner.nextLine().trim();
            if (title.isEmpty()) break;
            System.out.print("  Author: ");
            String author = scanner.nextLine().trim();
            cloned.addBook(new Book(title, author));
        }

        recommendations.add(cloned);
        System.out.println("Cloned recommendation saved: " + cloned);
    }

    private static void modifyExisting(List<Recomendation> recommendations, Scanner scanner) {
        if (recommendations.isEmpty()) {
            System.out.println("No recommendations to modify.");
            return;
        }
        viewRecommendations(recommendations);
        System.out.print("Index to modify: ");
        int index;
        try {
            index = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number.");
            return;
        }
        if (index < 0 || index >= recommendations.size()) {
            System.out.println("Index out of range.");
            return;
        }

        Recomendation rec = recommendations.get(index);
        System.out.print("New target audience (blank to keep \"" + rec.getTargetAudience() + "\"): ");
        String audience = scanner.nextLine().trim();
        if (!audience.isEmpty()) {
            rec.setTargetAudience(audience);
        }

        // Remove books
        List<Book> books = rec.getBooks();
        if (!books.isEmpty()) {
            System.out.println("Current books:");
            for (int i = 0; i < books.size(); i++) {
                System.out.println("  [" + i + "] " + books.get(i));
            }
            System.out.println("Enter indices to remove (comma-separated, blank to skip):");
            System.out.print("  Remove: ");
            String removeInput = scanner.nextLine().trim();
            if (!removeInput.isEmpty()) {
                String[] parts = removeInput.split(",");
                List<Book> toRemove = new ArrayList<>();
                for (String part : parts) {
                    try {
                        int ri = Integer.parseInt(part.trim());
                        if (ri >= 0 && ri < books.size()) {
                            toRemove.add(books.get(ri));
                        }
                    } catch (NumberFormatException e) {
                        // skip invalid
                    }
                }
                for (Book b : toRemove) {
                    rec.removeBook(b);
                }
            }
        }

        System.out.println("Add books (blank title to stop):");
        while (true) {
            System.out.print("  Book title: ");
            String title = scanner.nextLine().trim();
            if (title.isEmpty()) break;
            System.out.print("  Author: ");
            String author = scanner.nextLine().trim();
            rec.addBook(new Book(title, author));
        }

        System.out.println("Recommendation updated: " + rec);
    }

    private static void createNew(List<Recomendation> recommendations, Scanner scanner) {
        System.out.print("Target audience: ");
        String audience = scanner.nextLine().trim();

        List<Book> books = new ArrayList<>();
        System.out.println("Add books (blank title to stop):");
        while (true) {
            System.out.print("  Book title: ");
            String title = scanner.nextLine().trim();
            if (title.isEmpty()) break;
            System.out.print("  Author: ");
            String author = scanner.nextLine().trim();
            books.add(new Book(title, author));
        }

        Recomendation rec = new Recomendation(audience, books);
        recommendations.add(rec);
        System.out.println("New recommendation saved: " + rec);
    }
}
