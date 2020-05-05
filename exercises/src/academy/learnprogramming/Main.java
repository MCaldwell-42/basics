package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(isLeapYear(1800));

        areEqualByThreeDecimalPlaces(4.1253, 6.6548);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking == true && ((hourOfDay < 8 && hourOfDay >= 0) || (hourOfDay > 22 && hourOfDay <= 23))) {
            return true;
        }
        return false;
    }

    public static boolean isLeapYear(int year) {
        if (year > 0 && year < 10000) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    }
                }
                return true;

            }
            return false;
        }
        return false;
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        double new_num1 = num1*1000;
        double new_num2 = num2*1000;
        int newnew1 = (int) new_num1;
        int newnew2 = (int) new_num2;

        System.out.println("newnew1 = "+newnew1+" and newnew2 = "+newnew2);
        if (newnew1 == newnew2){
            return true;
        }
        return false;
    }
}

