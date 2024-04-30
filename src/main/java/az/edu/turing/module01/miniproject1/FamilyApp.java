package az.edu.turing.module01.miniproject1;

import java.util.Scanner;

public class FamilyApp {


    public static void main(String[] args) {
        FamilyDAO familyDao = new CollectionFamilyDAO();

        // Create a FamilyService instance
        FamilyService familyService = new FamilyService(familyDao);

        // Create a FamilyController instance
        FamilyController familyController = new FamilyController(familyService);

        while (true) {
            printMenu();
            String command = new Scanner(System.in).nextLine().trim();

            try {
                switch (command) {
                    case "1":
                        //fillTestData();
                        break;
                    case "2":
                        familyController.displayAllFamilies();
                        break;
                    case "3":
                        System.out.println(familyController.getFamiliesBiggerThan(3));
                        ;
                        break;
                    case "4":
                        System.out.println(familyController.getFamiliesLessThan(4));
                        ;
                        break;
                    case "5":
                        System.out.println(familyController.countFamiliesWithMemberNumber(3));
                        ;
                        break;
                    case "6":
                        familyController.createNewFamily(new Woman("Shakira", "Qezenfrova", 2000), new Man("Elvis", "Presley", 1970));
                        break;
                    case "7":
                        System.out.print("Enter the index of the family to delete: ");
                        int indexToDelete = Integer.parseInt(new Scanner(System.in).nextLine().trim());
                        System.out.println(familyDao.deleteFamily(indexToDelete));
                        break;

                    case "8.1":
                        System.out.println(familyController.bornChild(familyDao.getFamilyByIndex(0), "Elvin", "man"));
                        break;
                    case "8.2":
                        System.out.println(familyController.adoptChild(familyDao.getFamilyByIndex(0), new Human("Aynur", "Eliyeva", 2002)));
                        break;
                    case "9":
                        familyController.deleteAllChildrenOlderThan(18);
                        break;
                    case "exit":
                        System.out.println("Exiting Family Management System. Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid command. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                break;
            }
        }

       familyDao.createNewFamily(new Woman("Unknown", "Unknown", 123), new Man("sdfsd", "adfsdfs", 1232));
        System.out.println(familyDao.getFamilyByIndex(0).prettyFormat());


    }

    private static void printMenu() {
        System.out.println("Choose an option:");
        System.out.println("1. Fill with test data");
        System.out.println("2. Display the entire list of families");
        System.out.println("3. Display families with more members than specified");
        System.out.println("4. Display families with fewer members than specified");
        System.out.println("5. Calculate number of families by member count");
        System.out.println("6. Create a new family");
        System.out.println("7. Delete a family");
        System.out.println("8.1 Give a birth to family");
        System.out.println("8.2 Adopt a child to family");
        System.out.println("9. Remove all children over a certain age");
        System.out.println("Type 'exit' to quit");
        System.out.print("Enter your choice: ");
    }

}

    

