package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int value = 1;
        if (value == 1) {
            System.out.println("Value is 1");
        } else if (value == 2) {
            System.out.println("Value is 2");
        } else {
            System.out.println("Wasn't either 1 or 2");
        }

        int switchValue = 4;
        // switch is good if you're only testing the same variable for different values
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Was a 3 or 4 or 5");
                break;

            default:
                System.out.println("Was not either");
                break;
        }

        System.out.println(calculateInterest(10000.0, 2));

        //for(init; termination; increment)
        for (int i = 0; i < 5; i++) {
            System.out.println("loop " + i + " times!");
        }

        for (int i = 0; i <= 5; i++) {
            System.out.println("i= " + i);
        }
        // while loops
        int count = 1;
        while (count <= 5) {
            System.out.println("count = " + count);
            count++;
        }

        //continue and breaks with while loops
        int number = 0;
        while (number < 15) {
            number++;
            if (number <= 5) {
                System.out.println("skipping num " + number);
                continue;
                //continue cuts loop short but doesn't stop it. resets it.
            }
            System.out.println("number= " + number);

            if (number >= 10) {
                System.out.println("Breaking at " + number);
                break;
            }
        }

        // do while will always do it at least once!
        int balls = 4;
        do {
            System.out.println("I have " +balls+" balls");
            balls--;
        } while (balls >= 2);
    }

        public static double calculateInterest ( double amount, double interestRate){
            return (amount * (interestRate / 100));
        }

}
