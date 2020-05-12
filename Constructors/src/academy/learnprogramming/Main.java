package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        BankAccount Account1 = new BankAccount();
        Account1.setAccountNumber("0001");
        Account1.setBalance(1500);
        Account1.setCustomerEmail("jeeves@email.com");
        Account1.setCustomerName("Butler Jeeves");
        Account1.setPhoneNumber("+1-731-446-4509");
        System.out.println("name: "+ Account1.getCustomerName());
        System.out.println("email: "+ Account1.getCustomerEmail());
        System.out.println("phone number: "+ Account1.getPhoneNumber());
        System.out.println("account number: "+ Account1.getAccountNumber());

        Account1.depositFunds(1000);
        Account1.withdrawFunds(950);

        BankAccount MattsAccount = new BankAccount("0002", 45000, "Matt", "Mattsemail@email.com", "+1-731-555-3333");
        MattsAccount.withdrawFunds(1200);
        BankAccount defaultAccount = new BankAccount();

        VipCustomer MrBlack = new VipCustomer(1000000, "MrBlack2@email.com");
        VipCustomer MattsVipAccount = new VipCustomer("Matt", 9000, "mattsemail@email.com");
        VipCustomer DefaultVip = new VipCustomer();

        System.out.println(DefaultVip.getName());

    }
}
