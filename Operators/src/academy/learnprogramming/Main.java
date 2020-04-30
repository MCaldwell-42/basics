package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
	    // two operators (=,+) and two operands (1,2);
        System.out.println(result);
        int previousResult = result;
        result = result - 1;
        System.out.println("new result is " + result);

        result = result * 10;
        System.out.println("The NEW new result is " + result);
        result = result / 5;
        System.out.println("Yooo the new new NEW result is " + result);

        result = result % 3;
        System.out.println("the remainder of the new result is " + result);

        result++; // this adds 1 to the previous result. it's an old code but it checks out
        result--; // takes one out. same same
        result += 2; //adds two to the value
        result *= 10; //result times 10
        result /= 3;
        result -= 2;
        System.out.println("result after all these shortcuts is " +result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I'm SHOOK");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the High Score!");
        }

        int secondTopScore = 90;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar){
            //checks to see if isCar is TRUE (In python I usually use it to see if something exists)
            System.out.println("This is not supposed to happen");
        }


    }
}
