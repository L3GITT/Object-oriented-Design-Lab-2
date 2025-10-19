public class Home {
    private String firstName;
    private String lastName;
    private int squareFootage;
    private double dwelling;
    private double contents;
    private double liability;
  
    public Home() {
        this.firstName = "";
        this.lastName = "";
        this.squareFootage = 0;
        this.dwelling = 0.0;
        this.contents = 0.0;
        this.liability = 0.0;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }
    
    public void setDwelling(double dwelling) {
        this.dwelling = dwelling;
    }
    
    public void setContents(double contents) {
        this.contents = contents;
    }
    
    public void setLiability(double liability) {
        this.liability = liability;
    }
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public int getSquareFootage() {
        return squareFootage;
    }
    
    public double getDwelling() {
        return dwelling;
    }
    
    public double getContents() {
        return contents;
    }
    
    public double getLiability() {
        return liability;
    }
    public double calculateCommission() {
        return (dwelling + contents + liability) * (17.0 / 75.0);
    }
    
    public void printPolicy() {
        System.out.println("Home Policy");
        System.out.println("-----------");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Footage: " + squareFootage);
        System.out.printf("Dwelling: $%,.2f%n", dwelling);
        System.out.printf("Contents: $%,.2f%n", contents);
        System.out.printf("Liability: $%,.2f%n", liability);
        System.out.printf("Commission: $%,.2f%n", calculateCommission());
    }
}
