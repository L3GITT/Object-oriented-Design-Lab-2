import java.util.Scanner;
public class CommissionCalculator {
    private Auto autoPolicy;
    private Home homePolicy;
    private Life lifePolicy;
    private Scanner scanner;
    
    public CommissionCalculator() {
        this.autoPolicy = new Auto();
        this.homePolicy = new Home();
        this.lifePolicy = new Life();
        this.scanner = new Scanner(System.in);
    }
    private void displayMenu() {
        System.out.println("-----------------------------");
        System.out.println("Welcome to Parkland Insurance");
        System.out.println("-----------------------------");
        System.out.println("Enter any of the following:");
        System.out.println("       1) Enter auto insurance policy information");
        System.out.println("       2) Enter home insurance policy information");
        System.out.println("       3) Enter life insurance policy information");
        System.out.println("       4) Compute commission and print auto policy");
        System.out.println("       5) Compute commission and print home policy");
        System.out.println("       6) Compute commission and print life policy");
        System.out.println("       7) Quit");
    }
    private void enterAutoPolicy() {
        System.out.print("Enter first name of insured: ");
        String firstName = scanner.nextLine();
        autoPolicy.setFirstName(firstName);
        
        System.out.print("Enter last name of insured: ");
        String lastName = scanner.nextLine();
        autoPolicy.setLastName(lastName);
        
        System.out.print("Enter make of vehicle: ");
        String make = scanner.nextLine();
        autoPolicy.setMake(make);
        
        System.out.print("Enter model of vehicle: ");
        String model = scanner.nextLine();
        autoPolicy.setModel(model);
        
        System.out.print("Enter amount of liability: $");
        double liability = scanner.nextDouble();
        scanner.nextLine();
        autoPolicy.setLiability(liability);
        
        System.out.print("Enter amount of collision: $");
        double collision = scanner.nextDouble();
        scanner.nextLine();
        autoPolicy.setCollision(collision);
    }
    private void enterHomePolicy() {
        System.out.print("Enter first name of insured: ");
        String firstName = scanner.nextLine();
        homePolicy.setFirstName(firstName);
        
        System.out.print("Enter last name of insured: ");
        String lastName = scanner.nextLine();
        homePolicy.setLastName(lastName);
        
        System.out.print("Enter house square footage: ");
        int footage = scanner.nextInt();
        scanner.nextLine();
        homePolicy.setSquareFootage(footage);
        
        System.out.print("Enter amount of dwelling: $");
        double dwelling = scanner.nextDouble();
        scanner.nextLine();
        homePolicy.setDwelling(dwelling);
        
        System.out.print("Enter amount of contents: $");
        double contents = scanner.nextDouble();
        scanner.nextLine();
        homePolicy.setContents(contents);
        
        System.out.print("Enter amount of liability: $");
        double liability = scanner.nextDouble();
        scanner.nextLine();
        homePolicy.setLiability(liability);
    }
    private void enterLifePolicy() {
        System.out.print("Enter first name of insured: ");
        String firstName = scanner.nextLine();
        lifePolicy.setFirstName(firstName);
        
        System.out.print("Enter last name of insured: ");
        String lastName = scanner.nextLine();
        lifePolicy.setLastName(lastName);
        
        System.out.print("Enter age of insured: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        lifePolicy.setAge(age);
        
        System.out.print("Enter amount of term: $");
        double term = scanner.nextDouble();
        scanner.nextLine();
        lifePolicy.setTerm(term);
    }
    public void Run() {
        int choice = 0;
        
        while (choice != 7) {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    enterAutoPolicy();
                    break;
                case 2:
                    enterHomePolicy();
                    break;
                case 3:
                    enterLifePolicy();
                    break;
                case 4:
                    autoPolicy.printPolicy();
                    System.out.println();
                    break;
                case 5:
                    homePolicy.printPolicy();
                    System.out.println();
                    break;
                case 6:
                    lifePolicy.printPolicy();
                    System.out.println();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}
