public class Life {
    private String firstName;
    private String lastName;
    private int age;
    private double term;
    public Life() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.term = 0.0;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setTerm(double term) {
        this.term = term;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getTerm() {
        return term;
    }
    public double calculateCommission() {
        return term * 0.20;
    }

    public void printPolicy() {
        System.out.println("Life Policy");
        System.out.println("-----------");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.printf("Term: $%,.2f%n", term);
        System.out.printf("Commission: $%,.2f%n", calculateCommission());
    }
}
