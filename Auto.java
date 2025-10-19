public class Auto {
    private String firstName;
    private String lastName;
    private String make;
    private String model;
    private double liability;
    private double collision;
    
    public Auto() {
        this.firstName = "";
        this.lastName = "";
        this.make = "";
        this.model = "";
        this.liability = 0.0;
        this.collision = 0.0;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setMake(String make) {
        this.make = make;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public void setLiability(double liability) {
        this.liability = liability;
    }
    
    public void setCollision(double collision) {
        this.collision = collision;
    }
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getMake() {
        return make;
    }
    
    public String getModel() {
        return model;
    }
    
    public double getLiability() {
        return liability;
    }
    
    public double getCollision() {
        return collision;
    }
    public double calculateCommission() {
        return (liability + collision) * 0.30;
    }
    public void printPolicy() {
        System.out.println("Auto Policy");
        System.out.println("-----------");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.printf("Liability: $%,.2f%n", liability);
        System.out.printf("Collision: $%,.2f%n", collision);
        System.out.printf("Commission: $%,.2f%n", calculateCommission());
    }
}
