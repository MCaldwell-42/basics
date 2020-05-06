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

    public static boolean hasTeen(int age1, int age2, int age3) {
        if ( (age1 >= 13 && age1 <= 19) || (age2 >= 13 && age2 <= 19) || (age3 >= 13 && age3 <= 19)) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int age) {
        if (age >= 13 && age <= 19) {
            return true;
        }
        return false;
    }

    public static boolean hasEqualSum(int num1, int num2, int ans) {
        if ( num1 + num2 == ans) {
            return true;
        }
        return false;
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        // 1MB = 1024 KB
        int megabytes = kiloBytes / 1024;
        int kilobytes = kiloBytes - (megabytes * 1024);
        if ( kiloBytes < 0){
            System.out.println("Invalid Value");
        } else if (kiloBytes >= 0) {
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + kilobytes + " KB");
        }
        }

    public static long toMilesPerHour(double kilometersPerHour){
        long milesPerHour = 0;
        if (kilometersPerHour < 0) {
            milesPerHour = -1;
        }
        if (kilometersPerHour >= 0) {
            milesPerHour = Math.round(kilometersPerHour/1.609);
        }
        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour>=0) {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        } else if (kilometersPerHour <0){
            System.out.println("Invalid Value");
        }

    }
}

