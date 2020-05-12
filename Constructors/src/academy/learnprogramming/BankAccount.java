package academy.learnprogramming;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;


    public BankAccount() {
        this("56789", 2.50, "Default name", "Default email", "Default phone");
        //this above calls the below constructor with parameters
        // can make multiple constructors like this with different parameters sent and some set to default
        System.out.println("Empty constructor call");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String customerEmail, String phoneNumber ){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getCustomerEmail(){
        return this.customerEmail;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void depositFunds(int deposit){
        this.balance += deposit;
        System.out.println(this.customerName+"'s balance is currently "+this.balance);
    }

    public void withdrawFunds(int withdraw){
        if(this.balance >= withdraw) {
            this.balance -= withdraw;
            System.out.println(this.customerName + "'s balance is now " + this.balance);
        } else {
            System.out.println("Insufficient funds for this withdrawal");
        }
        }
}
