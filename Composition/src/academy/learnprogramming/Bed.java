package academy.learnprogramming;

public class Bed {
    private String size;

    public Bed(String size) {
        this.size = size;
    }

    public void goToSleep(int amountofTime) {
        System.out.println("You slept in your "+ this.size+" bed for "+ amountofTime +" hours");
    }
}
