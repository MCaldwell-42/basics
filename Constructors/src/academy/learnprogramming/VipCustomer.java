package academy.learnprogramming;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;
    // can make constructors, getters, setters, etc via intelliJ for quick coding
    public VipCustomer() {
        this("Mr. Jenkins", 9000, "standin@email.com");
        System.out.println("empty default constructor called");
    }

    public VipCustomer(String name, double creditLimit, String email ){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer(double creditLimit, String email) {
        this("John Doe", creditLimit, email);
        System.out.println("Anonymous customer added");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
